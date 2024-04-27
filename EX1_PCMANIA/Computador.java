public class Computador {
    public String marca;
    public float preco;
    HardwareBasico[] hardwareBasicos;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoriaUSB;
    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        hardwareBasicos = new HardwareBasico[2];
        sistemaOperacional = new SistemaOperacional();
    }
    public void addHardware(HardwareBasico hardwareBasico)
    {
        for (int i = 0; i < hardwareBasicos.length; i++) {
                if (hardwareBasicos[i] == null)
                {
                    hardwareBasicos[i] = hardwareBasico;
                    break;
                }
        }
    }
    public void mostraPCConfigs()
    {
        System.out.println("Marca do PC: " + marca + " Sistema Operacional:" + sistemaOperacional.nome + " - " + sistemaOperacional.tipo + " Memoria USB:" + memoriaUSB.nome + " - " + memoriaUSB.capacidade);
        System.out.println("Hardwares do PC:");
        for (int i = 0; i < hardwareBasicos.length; i++) {
            {
                if (hardwareBasicos[i] != null)
                {
                    System.out.println(hardwareBasicos[i].nome);
                    System.out.println(hardwareBasicos[i].capacidade);
                }
            }

        }
    }
    public void addMemoriaUSB(MemoriaUSB musb)
    {
        memoriaUSB = musb;
    }

}
