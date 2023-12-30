package javax.persistence;

public @interface OneToMany {

	String mappedBy();

	String cascade();

	

}
