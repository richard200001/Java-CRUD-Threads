
package modelo;


public class DeveloperCompany {
    private int idCompany;
    private String name;
    private String country;
    private String dateCreaction;

    public DeveloperCompany(int idCompany, String name, String country, String dateCreaction) {
        this.idCompany = idCompany;
        this.name = name;
        this.country = country;
        this.dateCreaction = dateCreaction;
    }

    public DeveloperCompany() {

    }

    public long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateCreaction() {
        return dateCreaction;
    }

    public void setDateCreaction(String dateCreaction) {
        this.dateCreaction = dateCreaction;
    }
    public Object[] toArray(){
        Object[] data = {idCompany,name,country,dateCreaction};
        return data;
  }
}
