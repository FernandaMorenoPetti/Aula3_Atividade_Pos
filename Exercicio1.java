public class ValidaCPFTest { 

  
    private ValidaCPF validaCPF; 

    @BeforeEach 

    public void setUp() { 

        validaCPF = new ValidaCPF(); 

    } 

  
    @Test 

    public void testCPFValido() { 

        assertTrue(validaCPF.isCPF("12345678909")); 

        assertTrue(validaCPF.isCPF("98765432109")); 

        assertTrue(validaCPF.isCPF("52998224725")); 

    } 


    @Test 

    public void testCPFFormatadoValido() { 

        assertTrue(validaCPF.isCPF("123.456.789-09")); 

        assertTrue(validaCPF.isCPF("987.654.321-09")); 

        assertTrue(validaCPF.isCPF("529.982.247-25")); 

    } 


    @Test 

    public void testCPFFormatadoComEspacosValido() { 

        assertTrue(validaCPF.isCPF("123.456.789-09 ")); 

        assertTrue(validaCPF.isCPF(" 987.654.321-09")); 

        assertTrue(validaCPF.isCPF(" 529.982.247-25 ")); 

    } 

    @Test 

    public void testCPFInvalido() { 

        assertFalse(validaCPF.isCPF("00000000000")); 

        assertFalse(validaCPF.isCPF("11111111111")); 

        assertFalse(validaCPF.isCPF("99999999998")); 

        assertFalse(validaCPF.isCPF("123.456.789-10")); 

        assertFalse(validaCPF.isCPF("abcde")); 

        assertFalse(validaCPF.isCPF("12345")); 

        assertFalse(validaCPF.isCPF("")); 

    } 

  
    @Test 

    public void testCPFNulo() { 

        assertFalse(validaCPF.isCPF(null)); 

    } 

} 
