package alert.amber.app.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import alert.amber.app.dao.AbstractDao;
import alert.amber.app.dao.BulletinsDao;
import alert.amber.app.mappers.BulletinMapper;
import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.entities.BulletinEntity;

@Repository("bulletinsDao")
public class BulletinsDaoImpl extends AbstractDao<Integer, BulletinEntity> implements BulletinsDao {

	@Override
	public BulletinEntity findBulletinById(String id) {
		return (BulletinEntity)getSession().get(BulletinEntity.class, id);
	}

	@Override
	public void saveBulletin(BulletinDto bulletinDto) {
		persist(BulletinMapper.mapBulletinDtoToBulletinEntity(bulletinDto));
	}

	@Override
	public void deleteBulletin(BulletinDto bulletinDto) {
		//Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        //query.setString("ssn", ssn);
        //query.executeUpdate();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<BulletinEntity> findAllBulletins() {
		Criteria criteria = createEntityCriteria();
	    return (List<BulletinEntity>) criteria.list();
	}
	
	/*public Employee findEmployeeBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Employee) criteria.uniqueResult();
    }*/

}
