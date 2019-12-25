package cn.geoary.design.mediatorpattern;

public class Main {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        Landlord landlord = new Landlord("房东老王", mediator);
        Tenant tenant = new Tenant("租客小张", mediator);
        mediator.setLandlord(landlord);
        mediator.setTenant(tenant);
        tenant.contact("房东，有房吗？");
        landlord.contact("有呢？ 情侣入组水电全免房租减半，有需要的吗？❤");
    }
}
