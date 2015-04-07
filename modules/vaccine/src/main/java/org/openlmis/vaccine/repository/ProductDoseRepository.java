/*
 * This program was produced for the U.S. Agency for International Development. It was prepared by the USAID | DELIVER PROJECT, Task Order 4. It is part of a project which utilizes code originally licensed under the terms of the Mozilla Public License (MPL) v2 and therefore is licensed under MPL v2 or later.
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the Mozilla Public License as published by the Mozilla Foundation, either version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Mozilla Public License for more details.
 *
 * You should have received a copy of the Mozilla Public License along with this program. If not, see http://www.mozilla.org/MPL/
 */

package org.openlmis.vaccine.repository;

import org.openlmis.vaccine.domain.VaccineProductDose;
import org.openlmis.vaccine.repository.mapper.ProductDoseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDoseRepository {

  @Autowired
  private ProductDoseMapper mapper;

  public void insert(VaccineProductDose dose){
    mapper.insert(dose);
  }

  public void update(VaccineProductDose dose){
    mapper.update(dose);
  }

  public List<VaccineProductDose> getDosesForProduct(Long programId, Long productId){
    return mapper.getDoseSettingByProduct(programId, productId);
  }

  public List<VaccineProductDose> getEmptyDosesForProduct(Long programId, Long productId){
    return mapper.getEmptySettingByProduct(programId, productId);
  }

  public List<VaccineProductDose> getProgramProductDoses(Long programId) {
    return mapper.getProgramProductDoses(programId);
  }
}
