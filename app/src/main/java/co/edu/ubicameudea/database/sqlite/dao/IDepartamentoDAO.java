package co.edu.ubicameudea.database.sqlite.dao;

import android.content.ContentValues;

import java.util.List;

/**
 * Created by CristianCamilo on 13/07/2015.
 */
public interface IDepartamentoDAO {

    public List<ContentValues> findAll();
}
