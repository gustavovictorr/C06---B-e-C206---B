public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] computadores = new Computador[10];

    public void addComputador(Computador computador, int variavelCompra)
    {
        for (int i = 0; i < computadores.length; i++) {
            if(computadores[i] == null) {
               computadores[i] = computador;
               if(variavelCompra == 1) {
                   computadores[i].addHardware(new HardwareBasico("Pentium Core i3", 2200));
                   computadores[i].addHardware(new HardwareBasico("Memória RAM ", 8));
                   computadores[i].addHardware(new HardwareBasico("HD", 500));
                   break;
               }
               else if(variavelCompra == 2) {
                   computadores[i].addHardware(new HardwareBasico("Pentium Core i5", 3370));
                   computadores[i].addHardware(new HardwareBasico("Memória RAM ", 16));
                   computadores[i].addHardware(new HardwareBasico("HD", 1));
                   break;
               }
               else if(variavelCompra == 3) {
                   computadores[i].addHardware(new HardwareBasico("Pentium Core i7", 4500));
                   computadores[i].addHardware(new HardwareBasico("Memória RAM ", 32));
                   computadores[i].addHardware(new HardwareBasico("HD", 2));
                   break;
               }
            }
        }
    }
    public float calculaTotalCompra()
    {
        float totalCompra = 0;
        for (int i = 0; i < computadores.length; i++) {
            if(computadores[i] != null)
            {
                totalCompra += computadores[i].preco;
            }
        }
        return totalCompra;
    }

    public void mostraPC()
    {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null)
            {
               computadores[i].mostraPCConfigs();
            }
        }
    }
}
