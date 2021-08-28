package com.ou7.devs.reposotory;

import com.ou7.devs.model.Call;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepo extends JpaRepository<Call, Long> {
}
