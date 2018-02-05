package com.example.aplikasibpr.test;

import com.example.aplikasibpr.entity.master.Agama;
import com.example.aplikasibpr.service.AgamaService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@RunWith(SpringRunner.class)
@SpringBootApplication
public class APlikasiBprApplicationTests extends TestCase {

    @Autowired
    private AgamaService agamaService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testSimpanAgama() {
        Agama islam = new Agama(null, "Islam", "Muslim",
                Timestamp.valueOf(LocalDateTime.now()), "admin");
        agamaService.save(islam);

        Agama kristen = new Agama(null, "Kristen", "Kristen Protestan",
                Timestamp.valueOf(LocalDateTime.now()), "admin");
        agamaService.save(kristen);

        List<Agama> daftarAgama = agamaService.findAll();
        assertEquals(daftarAgama.size(), 2);

        agamaService.delete(daftarAgama);
        daftarAgama = agamaService.findAll();
        assertEquals(daftarAgama.size(), 0);

    }

}
