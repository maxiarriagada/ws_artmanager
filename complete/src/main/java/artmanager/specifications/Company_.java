package artmanager.specifications;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import artmanager.entity.Company;

@StaticMetamodel(Company.class)
public class Company_ {
    public static volatile SingularAttribute<Company, String> businessname;
    public static volatile SingularAttribute<Company, String> cuit;
   
}