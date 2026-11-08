package packages;

import packages.db.Calc;
import packages.db.AdvCalc;

import java.util.ArrayList;

import packages.db.*;
// packages are like folders in java. since we need to use many folders or lots of files to make a heavy project. here we need give structure to our project. so we use packages. each and every classes have packages. packages should have a unique name. it is the convention of writting . we have inbuilt class so we also have to import it from java util. there is some default loaded packages for class like system, string etc. some times we have to import multiples files or class so we use star* for it.

public class Add {
    Calc obj = new Calc();
    AdvCalc obj1 = new AdvCalc();
    // ArrayList list=new ArrayList(); default or inbuilt class
    // system has inbuilt package . package.lang.*

}
