package Filepackage;

import java.io.IOException;
import java.util.List;

public interface ReadFile 
{
    List<String> read(String fileName) throws IOException;
}
