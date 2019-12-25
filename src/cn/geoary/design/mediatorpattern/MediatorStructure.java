package cn.geoary.design.mediatorpattern;

public class MediatorStructure implements Mediator {

    private Landlord landlord;
    private Tenant tenant;

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, AbstractPerson person) {
        if(person == landlord){
            tenant.startMessage(message);
        }else {
            landlord.startMessage(message);
        }
    }
}
