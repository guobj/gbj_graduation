package com.gbj.graduation.service;

import com.gbj.graduation.model.Goods;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface GoodsService {
	public Map<String, Object> goodsMap(Map<String, Object> map);

	public int goodsAddAction(Map<String, Object> map);

	public Map<String, Object> load(Map<String, Object> map, Integer goods_id);

	public int goodsUpdateAction(Map<String, Object> map);

	public int goodsDel(Map<String, Object> map, Integer goods_id);

	public int goodsMoreDel(Map<String, Object> map);

	public Map<String, Object> goodsStockList(Map<String, Object> map);

	public int goodsStockInUpdate(Map<String, Object> map);

	public int goodsStockInUpdateAction(Map<String, Object> map);

	public Map<String, Object> goodsStockOutList(Map<String, Object> map);

	//柱状图X轴data数据
	public List<Goods> stocking(Map<String, Object> map);

	//确认出库 即修改出库单状态及添加出库时间
	public int confirmGoodsOut(Map<String, Object> map);

	//文件导出
	public List<Goods> goodsExcel();

	//文件导入
	public Map<String, Object> importGoodsExcel(Map<String, Object> resultMap, MultipartFile file, HttpServletRequest multipartRequest) throws IOException;
}
