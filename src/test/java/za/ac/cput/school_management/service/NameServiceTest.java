/**
 * NameServiceTest.java
 * Test class for NameService
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
package za.ac.cput.school_management.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.factory.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class NameServiceTest {

    private Name name, name1, name2;
    private Name.NameId nameId, nameId1, nameId2;

    private NameService service = NameService.getRepository();

    @BeforeEach
    void setUp(){
        name = NameFactory.build("Sonwabile","","Gxoyiya");
        nameId = new Name.NameId(name.getFistName(), name.getLastName());
        name1 = NameFactory.build("Siyabulela", "", "Gxoyiya");
        nameId1 = new Name.NameId(name1.getFistName(), name1.getLastName());
        name2 = NameFactory.build("Jack","","Daniels");
        nameId2 = new Name.NameId(name2.getFistName(), name2.getLastName());
        service.save(name);
        service.save(name1);
        service.save(name2);
    }
    @Test
    void save() {
        Name saveName = service.save(name);
        assertNotNull(saveName);
        System.out.println("Value: " + saveName);
    }

    @Test
    void read() {
        Name readName = service.read(nameId1);
        assertNotNull(readName);
        System.out.println("Value: " + readName);
    }

    @Test
    void delete() {
        Name nameDelete = service.delete(name2);
        System.out.println(service.getAll());

    }
}