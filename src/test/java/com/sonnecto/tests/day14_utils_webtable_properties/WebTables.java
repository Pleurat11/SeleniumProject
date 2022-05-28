package com.sonnecto.tests.day14_utils_webtable_properties;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WebTables {
    /**
     Handling Web Tables in Selenium:

     WebTables in HTML are used to display data using rows and columns and cell.
     Similar to excel worksheet.

     In HTML we use following tags when working with WebTables:
     <table id ="friends"> </table> </table> -> tag for the whole table
     <thead> </thead> -> tag for table header/ column names
     <tr> </tr> -> tag for table row
     <td> </td> -> tag for table data/cell

     <table id ="friends">
        <thead>
                <tr>
                    <td>Name</td>
                    <td>City</td>
                </tr>
        </thead>
     </table>


     In test automation, we normally need to READ the data from WEBTABLES and ASSERT if data is matching
     expected values.

     We use xpath mainly for handling WebTables and reading values from rows/columns.
     //table[@id='friends'] LOCATES THE WHOLE TABLE.

     Xpath to locate column/header names:
     */

}
