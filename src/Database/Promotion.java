/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author informatics
 */
public class Promotion {
    int promotionID;
    String proName;
    String dateStart;
    String dateEnd;

    public Promotion() {
    }

    public Promotion(int promotionID, String proName, String dateStart, String dateEnd) {
        this.promotionID = promotionID;
        this.proName = proName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public int getPromotionID() {
        return promotionID;
    }

    @Override
    public String toString() {
        return "Promotion{" + "promotionID=" + promotionID + ", proName=" + proName + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd + '}';
    }

    public void setPromotionID(int promotionID) {
        this.promotionID = promotionID;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getProName() {
        return proName;
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }
    
    
}
