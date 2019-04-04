package com.leroymerlin.va.validation.repository;

import com.leroymerlin.va.validation.entity.AuditLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends CrudRepository< AuditLog, Integer >
{
}
