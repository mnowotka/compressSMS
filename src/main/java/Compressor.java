import java.util.Arrays;import java.util.stream.Collectors;public class Compressor {    public String compressNaive(String text){        String[] words = text.split(" ");        return Arrays.stream(words)                .map(x->x.substring(0,1).toUpperCase() + x.substring(1))                .collect(Collectors.joining());    }}