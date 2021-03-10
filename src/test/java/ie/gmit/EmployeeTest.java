/*
Oisin Concannon
Group A
G00347603
In Class Test
10/03/21
 */
package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

        @Test
        void titleTest(){
            Employee e = new Employee();
            e.setTitle("Mr");
            assertEquals("Mr",e.getTitle());

            Employee e1 = new Employee();
            e1.setTitle("Mrs");
            assertEquals("Mrs",e1.getTitle());

            Employee e2 = new Employee();
            e2.setTitle("Ms");
            assertEquals("Ms",e2.getTitle());
        }
        @Test
        void titleTestFail(){
            Employee e = new Employee();
            assertThrows(IllegalArgumentException.class,() -> e.setTitle("Me"));

        }

        @Test
        void nameTest(){
            Employee e = new Employee();
            e.setName("oisin");
            assertEquals("oisin",e.getName());
        }
        @Test
        void nameTestFail(){
            Employee e = new Employee();
            assertThrows(IllegalArgumentException.class,() -> e.setName("er"));
            Employee e1 = new Employee();
            assertThrows(IllegalArgumentException.class,() -> e1.setName("sjafksdfhjkdshfjkshfjsdhfjkdshfjkshsdfa"));

        }
        @Test
        void PPSTest(){
            Employee e = new Employee();
            e.setPPS(12345678);
            assertEquals(12345678,e.getPPS());
        }
        @Test
        void PPSTestFail(){
            Employee e = new Employee();
            assertThrows(IllegalArgumentException.class,() -> e.setPPS(123));

        }
        @Test
        void phoneTest(){
            Employee e = new Employee();
            e.setPhone("123456789");
            assertEquals("123456789",e.getPhone());
        }
        @Test
        void phoneTestFail(){
            Employee e = new Employee();
            assertThrows(IllegalArgumentException.class,() -> e.setPhone("123"));

        }
        @Test
        void employmentTest(){
            Employee e = new Employee();
            e.setEmploymentType("Full time");
            assertEquals("Full time",e.getEmploymentType());

            Employee e1 = new Employee();
            e1.setEmploymentType("Part time");
            assertEquals("Part time",e1.getEmploymentType());

            Employee e2 = new Employee();
            e2.setEmploymentType("Contract");
            assertEquals("Contract",e2.getEmploymentType());

        }
        @Test
        void employmentTestFail(){
            Employee e = new Employee();
            assertThrows(IllegalArgumentException.class,() -> e.setEmploymentType("not working"));

        }
        @Test
        void ageTest(){
            Employee e = new Employee();
            e.setAge(18);
            assertEquals(18,e.getAge());
        }
        @Test
        void ageTestFail(){
            Employee e = new Employee();
            assertThrows(IllegalArgumentException.class,() -> e.setAge(12));

        }


}
