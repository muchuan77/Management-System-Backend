package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.util.Identifiable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Slf4j
@Validated
public abstract class BaseController<T extends Identifiable, Mapper extends BaseMapper<T>>{
    protected abstract Mapper getMapper();

    @GetMapping("/{id}")
    public T getById(@PathVariable Integer id) {
        return getMapper().selectById(id);
    }

    @PostMapping("/add")
    public String addEntity(@RequestBody T entity) {
        int result = getMapper().insert(entity);
        return result > 0 ? entity.getClass().getSimpleName() + " added successfully" : "Failed to add " + entity.getClass().getSimpleName();
    }

    @PutMapping("/{id}")
    public String updateEntity(@PathVariable Integer id, @RequestBody T updatedEntity) {
        updatedEntity.setId(id);
        int result = getMapper().updateById(updatedEntity);
        return result > 0 ? updatedEntity.getClass().getSimpleName() + " updated successfully" : "Failed to update " + updatedEntity.getClass().getSimpleName();
    }

    @DeleteMapping("/{id}")
    public String deleteEntity(@PathVariable Integer id) {
        int result = getMapper().deleteById(id);
        return result > 0 ? "Entity deleted successfully" : "Failed to delete entity";
    }

    @GetMapping("/list")
    public List<T> getAllEntities() {
        return getMapper().selectList(null);
    }

    @GetMapping("/search")
    public List<T> searchEntities(@RequestParam Map<String, Object> params) {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        // 根据前端传递的参数构建查询条件
        params.forEach(queryWrapper::eq);
        return getMapper().selectList(queryWrapper);
    }

    @GetMapping("/customQuery")
    public List<T> customQueryEntities() {
        // 实现自己的查询逻辑
        // 例如：getMapper().customQueryMethod()
        return Collections.emptyList();
    }
}


