package test;

import Lab_4.Parquet;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ParquetTest {
    @Test
    public void TestParquetConstructor(){

    Parquet parq = new Parquet("parquet", "OAK", "France", 70, 5, 10, 1, 100);
    assertThat(parq.getAmount(),is(100));
}
}