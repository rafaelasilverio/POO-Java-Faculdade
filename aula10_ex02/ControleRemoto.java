package aula10_ex02;

public class ControleRemoto 
{
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume() {
        if (tv.getVolume() < 100) 
        {
            tv.setVolume(tv.getVolume() + 1);
        }
    }
        
    public void diminuirVolume() {
        if (tv.getVolume() > 1) 
        {
            tv.setVolume(tv.getVolume() - 1);   
        }
    }

    public void definirVolume(int volume) 
    {
        if((volume > 0) && (volume < 101))
        {
            tv.setVolume(volume);
        }
    }

    public void aumentarCanal() 
    {
        if (tv.getCanal() < 50) 
        {
            tv.setCanal(tv.getCanal() + 1);
        }
    }

    public void diminuirCanal() 
    {
        if (tv.getCanal() > 1) 
        {
            tv.setCanal(tv.getCanal() - 1);
        }
    }

    public void definirCanal(int canal)
    {
        if (canal >= 1 && canal <= 50) 
        {
            tv.setCanal(canal);
        }
    }

    public void trocarCanal(int canal) 
    {
        tv.setCanal(canal);
    }

    public int consultarVolume() 
    {
        return tv.getVolume();
    }

    public int consultarCanal() 
    {
        return tv.getCanal();
    }

}
