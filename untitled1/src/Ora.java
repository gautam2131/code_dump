import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ora {

    public static void main(String[] args) throws IOException, URISyntaxException {
        ObjectMapper om = new ObjectMapper();
//        File input = new File("D:\\programming\\java\\untitled1\\src\\input.json");
//        Squad team2 = new Squad("ultra","chennai",1996,"vellore", true,
//        new Member[2]);
//        String s = om.writeValueAsString(team2);
        String s = readFileAsString("input.json");


//        Squad team =  om.readValue(s,Squad.class);
//       System.out.println(s);

        List<Squad> list = om.readValue(s,new TypeReference<List<Squad>>() { });



    }
    private static String readFileAsString(String filename) throws URISyntaxException, IOException {
        return new String(Files.readAllBytes(resolveFileFromResources(filename).toPath()),
                "UTF-8");
    }


    private static File resolveFileFromResources(String filename) throws URISyntaxException {
        return Paths.get(
                Thread.currentThread().getContextClassLoader().getResource(filename).toURI()).toFile();
    }
//    private static void printJsonObject(Object object) throws IOException {
//        Logger logger = Logger.getLogger(PortfolioManagerApplication.class.getCanonicalName());
//        ObjectMapper mapper = new ObjectMapper();
//        logger.info(mapper.writeValueAsString(object));

        private static ObjectMapper getObjectMapper() {
            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.registerModule(new JavaTimeModule());
            return objectMapper;
        }


}
