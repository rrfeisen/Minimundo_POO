/*
 * Copyright (C) 2025 Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.repository;

import java.util.List;

/**
 * Required methods for all data repositories
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1
 * @param <T> Generic type
 * @since 0.1, 2025-07-01
 */
public interface IRepository<T> {

    Long saveOrUpdate(T e);

    String getJpqlFindAll();

    List<T> findAll();

    String getJpqlFindById();

    T findById(Long id);

    String getJpqlDeleteById();

    boolean delete(T e);

    boolean delete(Long id);

}
