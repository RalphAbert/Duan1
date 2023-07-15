package Repositories.impl;

import DomainModels.NhanVien;
import Utilies.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RepositoryNhanVien {

    private Session session = HibernateUtil.getSession();

    public NhanVien DangNhap(String Email, String MatKhau) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email and MatKhau = :MatKhau");
        query.setParameter("Email", Email);
        query.setParameter("MatKhau", MatKhau);
        try {
            return (NhanVien) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public UUID checkEmail(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email", NhanVien.class);
        query.setParameter("Email", Email);
        NhanVien result = new NhanVien();
        try {
            return ((NhanVien) query.getSingleResult()).getId();
        } catch (NoResultException e) {
            return null;
        }
    }

    public NhanVien checkVaiTro(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email AND _Role = 1");
        query.setParameter("Email", Email);
        NhanVien result = new NhanVien();
        try {
            return (NhanVien) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public NhanVien checkEmailNhanVien(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email");
        query.setParameter("Email", Email);
        try {
            return (NhanVien) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public String checkMatKhau(String Email) {
        session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM NhanVien WHERE Email = :Email");
        query.setParameter("Email", Email);
        try {
            return ((NhanVien) query.getSingleResult()).getMatKhau();
        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean UpdateTaiKhoan(NhanVien nv) {
        try {
            session = HibernateUtil.getSession();
            Transaction tran = session.getTransaction();
            tran.begin();
            session.saveOrUpdate(nv);
            tran.commit();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public Boolean UpdateNhanVien(NhanVien tk) {
        Transaction tran = null;
        try {
            session = HibernateUtil.getSession();
            tran = session.beginTransaction();
            session.saveOrUpdate(tk);
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<NhanVien> getAllNV() {
        List<NhanVien> listNV = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM NhanVien", NhanVien.class);
            if (query.getResultList() != null && !query.getResultList().isEmpty()) {
                listNV = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }

    public Boolean InsertTaiKhoan(NhanVien tk) {
        try {
            session = HibernateUtil.getSession();
            Transaction tran = session.getTransaction();
            tran.begin();
            session.save(tk);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
}
