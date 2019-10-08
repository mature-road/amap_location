import 'dart:typed_data';

import 'package:amap_location_fluttify/src/ios/ios.export.dart';
import 'package:amap_location_fluttify/src/android/android.export.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class AMapLocationDistrictItem extends NSObject with NSCoding, NSCopying {
  static final _channel = MethodChannel('me.yohom/amap_location_fluttify');

  // 生成getters
  Future<String> get_cityCode() async {
    final result = await _channel.invokeMethod("AMapLocationDistrictItem::get_cityCode", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_cityCode(String cityCode) async {
    await _channel.invokeMethod('AMapLocationDistrictItem::set_cityCode', {'refId': refId, "cityCode": cityCode});
  
  
  }
  

  // 生成方法们
  
}