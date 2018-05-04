package artmanager.services;

import java.util.List;


import artmanager.dto.Visit;

public interface VisitService extends IService<Visit>{
	public List<Visit> search(Visit visit);
}
