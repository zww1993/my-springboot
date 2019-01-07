package com.zw.myspringboot.utils.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * @ClassName AutoGeneratorHelper
 * @Description 自动生成映射工具类
 *
 * @author huangshengju
 * @date 2018年07月11日
 * @version 1.0
 */
public class AutoGeneratorHelper {


    /**
     * @ClassName AutoGeneratorHelper
     * @Description 测试 run 执行
     *
     * @author huangshengju
     * @date 2018年07月11日
     * @version 1.0
     */
    public static void main(String[] args) {
        //用来获取Mybatis-Plus.properties文件的配置信息
        ResourceBundle rb =  ResourceBundle.getBundle("Mybatis-Plus");
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(rb.getString("OutputDir"));


        gc.setFileOverride(true);
        // 开启 activeRecord 模式
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(false);
        gc.setAuthor(rb.getString("author"));
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert());
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(rb.getString("userName"));
        dsc.setPassword(rb.getString("password"));
        dsc.setUrl(rb.getString("url"));
        mpg.setDataSource(dsc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 此处可以修改为您的表前缀
//        strategy.setTablePrefix(new String[] { "cps_", "" });
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
        strategy.setInclude(rb.getString("tableName").split(","));
        // 字段名生成策略
        // strategy.setFieldNaming(NamingStrategy.underline_to_camel);
        //strategy.setSuperServiceImplClass("com.baomidou.springwind.service.support.BaseServiceImpl");
        mpg.setStrategy(strategy);


        // 包配置
        PackageConfig pc = new PackageConfig();
        // pc.setModuleName("test");
        // 自定义包路径
        pc.setParent(rb.getString("parent"));
        // 这里是控制器包名，默认 web
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setMapper("dao");
        pc.setXml("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);
        // 执行生成
        mpg.execute();
    }
}