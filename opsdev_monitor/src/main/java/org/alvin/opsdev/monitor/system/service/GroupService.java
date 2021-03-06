package org.alvin.opsdev.monitor.system.service;

import com.google.common.collect.Lists;
import org.alvin.opsdev.monitor.system.domain.DeviceGroup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by tangzhichao on 2017/4/21.
 */
@Service
@Transactional(readOnly = true)
public class GroupService {

    public List<DeviceGroup> getAllGroup() {
        return Lists.newArrayList();
    }
}
