/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskWeek9;

/**
 *
 * @author PC BAY
 */
public interface Phone
{
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_BATT_LEVEL = 100;
    public static final int MIN_BATT_LEVEL = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
    void topupPulsa(int jumlah);
    int cekPulsa();
}