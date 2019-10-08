package me.yohom.amap_location_fluttify

import android.os.Bundle
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.PluginRegistry.Registrar

val HEAP = mutableMapOf<Int, Any>()

@Suppress("FunctionName", "UsePropertyAccessSyntax", "RedundantUnitReturnType", "UNUSED_PARAMETER", "SpellCheckingInspection", "ConvertToStringTemplate", "DEPRECATION", "UNUSED_VARIABLE")
class AmapLocationFluttifyPlugin(private val registrar: Registrar): MethodChannel.MethodCallHandler {

    companion object {
        @JvmStatic
        fun registerWith(registrar: Registrar) {
            val channel = MethodChannel(registrar.messenger(), "me.yohom/amap_location_fluttify")
            channel.setMethodCallHandler(AmapLocationFluttifyPlugin(registrar))

            // 注册View
            
        }
    }

    private val handlerMap = mapOf<String, (Registrar, Map<String, Any>, MethodChannel.Result) -> Unit>(
        "com.autonavi.aps.amapapi.model.AMapLocationServer::toStr" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.autonavi.aps.amapapi.model.AMapLocationServer
        
            // 日志打印
            println("fluttify-kotlin: com.autonavi.aps.amapapi.model.AMapLocationServer@$refId::toStr([])")
        
            // 开始调用
            val result = ref.toStr()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.LocationManagerBase::setLocationOption" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocationClientOption
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::setLocationOption([])")
        
            // 开始调用
            ref.setLocationOption(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::setLocationListener" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocationListener
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::setLocationListener([])")
        
            // 开始调用
            ref.setLocationListener(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::startLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::startLocation([])")
        
            // 开始调用
            ref.startLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::stopLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::stopLocation([])")
        
            // 开始调用
            ref.stopLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::getLastKnownLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::getLastKnownLocation([])")
        
            // 开始调用
            val result = ref.getLastKnownLocation()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.LocationManagerBase::startAssistantLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::startAssistantLocation([])")
        
            // 开始调用
            ref.startAssistantLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::stopAssistantLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::stopAssistantLocation([])")
        
            // 开始调用
            ref.stopAssistantLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::isStarted" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::isStarted([])")
        
            // 开始调用
            val result = ref.isStarted()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.LocationManagerBase::unRegisterLocationListener" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocationListener
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::unRegisterLocationListener([])")
        
            // 开始调用
            ref.unRegisterLocationListener(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::onDestroy" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::onDestroy([])")
        
            // 开始调用
            ref.onDestroy()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.LocationManagerBase::disableBackgroundLocation" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.LocationManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.LocationManagerBase@$refId::disableBackgroundLocation([\"var1\":$var1])")
        
            // 开始调用
            ref.disableBackgroundLocation(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::setLocationOption" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocationClientOption
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::setLocationOption([])")
        
            // 开始调用
            ref.setLocationOption(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::setLocationListener" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocationListener
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::setLocationListener([])")
        
            // 开始调用
            ref.setLocationListener(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::startLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::startLocation([])")
        
            // 开始调用
            ref.startLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::stopLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::stopLocation([])")
        
            // 开始调用
            ref.stopLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::getLastKnownLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::getLastKnownLocation([])")
        
            // 开始调用
            val result = ref.getLastKnownLocation()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClient::startAssistantLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::startAssistantLocation([])")
        
            // 开始调用
            ref.startAssistantLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::stopAssistantLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::stopAssistantLocation([])")
        
            // 开始调用
            ref.stopAssistantLocation()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::getVersion" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::getVersion([])")
        
            // 开始调用
            val result = ref.getVersion()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClient::setApiKey" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as String
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient::setApiKey([\"var0\":$var0])")
        
            // 开始调用
            com.amap.api.location.AMapLocationClient.setApiKey(var0)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::isStarted" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::isStarted([])")
        
            // 开始调用
            val result = ref.isStarted()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClient::unRegisterLocationListener" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocationListener
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::unRegisterLocationListener([])")
        
            // 开始调用
            ref.unRegisterLocationListener(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::onDestroy" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::onDestroy([])")
        
            // 开始调用
            ref.onDestroy()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::disableBackgroundLocation" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient@$refId::disableBackgroundLocation([\"var1\":$var1])")
        
            // 开始调用
            ref.disableBackgroundLocation(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClient::getDeviceId" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var0 = HEAP[args["var0"] as Int] as android.content.Context
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClient::getDeviceId([])")
        
            // 开始调用
            val result = com.amap.api.location.AMapLocationClient.getDeviceId(var0)
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationListener::onLocationChanged" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocation
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationListener
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationListener@$refId::onLocationChanged([])")
        
            // 开始调用
            ref.onLocationChanged(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.DPoint::getLongitude" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.DPoint
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.DPoint@$refId::getLongitude([])")
        
            // 开始调用
            val result = ref.getLongitude()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.DPoint::setLongitude" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.DPoint
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.DPoint@$refId::setLongitude([\"var1\":$var1])")
        
            // 开始调用
            ref.setLongitude(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.DPoint::getLatitude" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.DPoint
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.DPoint@$refId::getLatitude([])")
        
            // 开始调用
            val result = ref.getLatitude()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.DPoint::setLatitude" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.DPoint
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.DPoint@$refId::setLatitude([\"var1\":$var1])")
        
            // 开始调用
            ref.setLatitude(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.CoordinateConverter::from" to { registrar, args, methodResult ->
            // 参数
            // 枚举参数
            val var1 = com.amap.api.location.CoordinateConverter.CoordType.values()[args["var1"] as Int]
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.CoordinateConverter
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordinateConverter@$refId::from([])")
        
            // 开始调用
            val result = ref.from(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.CoordinateConverter::coord" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.DPoint
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.CoordinateConverter
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordinateConverter@$refId::coord([])")
        
            // 开始调用
            val result = ref.coord(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.CoordinateConverter::convert" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.CoordinateConverter
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordinateConverter@$refId::convert([])")
        
            // 开始调用
            val result = ref.convert()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.CoordinateConverter::isAMapDataAvailable" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as Double
            // jsonable参数
            val var2 = args["var2"] as Double
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordinateConverter::isAMapDataAvailable([\"var0\":$var0, \"var2\":$var2])")
        
            // 开始调用
            val result = com.amap.api.location.CoordinateConverter.isAMapDataAvailable(var0, var2)
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.CoordinateConverter::calculateLineDistance" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var0 = HEAP[args["var0"] as Int] as com.amap.api.location.DPoint
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.DPoint
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordinateConverter::calculateLineDistance([])")
        
            // 开始调用
            val result = com.amap.api.location.CoordinateConverter.calculateLineDistance(var0, var1)
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.CoordUtil::convertToGcj" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as DoubleArray
            // jsonable参数
            val var1 = args["var1"] as DoubleArray
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordUtil::convertToGcj([\"var0\":$var0, \"var1\":$var1])")
        
            // 开始调用
            val result = com.amap.api.location.CoordUtil.convertToGcj(var0, var1)
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.CoordUtil::isLoadedSo" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordUtil::isLoadedSo([])")
        
            // 开始调用
            val result = com.amap.api.location.CoordUtil.isLoadedSo()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.CoordUtil::setLoadedSo" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as Boolean
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.CoordUtil::setLoadedSo([\"var0\":$var0])")
        
            // 开始调用
            com.amap.api.location.CoordUtil.setLoadedSo(var0)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol::getValue" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol@$refId::getValue([])")
        
            // 开始调用
            val result = ref.getValue()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.UmidtokenInfo::getUmidtoken" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.UmidtokenInfo::getUmidtoken([])")
        
            // 开始调用
            val result = com.amap.api.location.UmidtokenInfo.getUmidtoken()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.UmidtokenInfo::setLocAble" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as Boolean
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.UmidtokenInfo::setLocAble([\"var0\":$var0])")
        
            // 开始调用
            com.amap.api.location.UmidtokenInfo.setLocAble(var0)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.UmidtokenInfo::setUmidtoken" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var0 = HEAP[args["var0"] as Int] as android.content.Context
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.UmidtokenInfo::setUmidtoken([\"var1\":$var1])")
        
            // 开始调用
            com.amap.api.location.UmidtokenInfo.setUmidtoken(var0, var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getGpsAccuracyStatus" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getGpsAccuracyStatus([])")
        
            // 开始调用
            val result = ref.getGpsAccuracyStatus()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setGpsAccuracyStatus" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setGpsAccuracyStatus([\"var1\":$var1])")
        
            // 开始调用
            ref.setGpsAccuracyStatus(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getLocationType" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getLocationType([])")
        
            // 开始调用
            val result = ref.getLocationType()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setLocationType" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setLocationType([\"var1\":$var1])")
        
            // 开始调用
            ref.setLocationType(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getLocationDetail" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getLocationDetail([])")
        
            // 开始调用
            val result = ref.getLocationDetail()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setLocationDetail" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setLocationDetail([\"var1\":$var1])")
        
            // 开始调用
            ref.setLocationDetail(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getErrorCode" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getErrorCode([])")
        
            // 开始调用
            val result = ref.getErrorCode()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setErrorCode" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setErrorCode([\"var1\":$var1])")
        
            // 开始调用
            ref.setErrorCode(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getErrorInfo" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getErrorInfo([])")
        
            // 开始调用
            val result = ref.getErrorInfo()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setErrorInfo" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setErrorInfo([\"var1\":$var1])")
        
            // 开始调用
            ref.setErrorInfo(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getCountry" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getCountry([])")
        
            // 开始调用
            val result = ref.getCountry()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setCountry" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setCountry([\"var1\":$var1])")
        
            // 开始调用
            ref.setCountry(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getRoad" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getRoad([])")
        
            // 开始调用
            val result = ref.getRoad()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setRoad" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setRoad([\"var1\":$var1])")
        
            // 开始调用
            ref.setRoad(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getAddress" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getAddress([])")
        
            // 开始调用
            val result = ref.getAddress()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setAddress" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setAddress([\"var1\":$var1])")
        
            // 开始调用
            ref.setAddress(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getProvince" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getProvince([])")
        
            // 开始调用
            val result = ref.getProvince()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setProvince" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setProvince([\"var1\":$var1])")
        
            // 开始调用
            ref.setProvince(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getCity" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getCity([])")
        
            // 开始调用
            val result = ref.getCity()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setCity" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setCity([\"var1\":$var1])")
        
            // 开始调用
            ref.setCity(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getDistrict" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getDistrict([])")
        
            // 开始调用
            val result = ref.getDistrict()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setDistrict" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setDistrict([\"var1\":$var1])")
        
            // 开始调用
            ref.setDistrict(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getCityCode" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getCityCode([])")
        
            // 开始调用
            val result = ref.getCityCode()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setCityCode" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setCityCode([\"var1\":$var1])")
        
            // 开始调用
            ref.setCityCode(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getAdCode" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getAdCode([])")
        
            // 开始调用
            val result = ref.getAdCode()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setAdCode" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setAdCode([\"var1\":$var1])")
        
            // 开始调用
            ref.setAdCode(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getPoiName" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getPoiName([])")
        
            // 开始调用
            val result = ref.getPoiName()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setPoiName" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setPoiName([\"var1\":$var1])")
        
            // 开始调用
            ref.setPoiName(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getLatitude" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getLatitude([])")
        
            // 开始调用
            val result = ref.getLatitude()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setLatitude" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setLatitude([\"var1\":$var1])")
        
            // 开始调用
            ref.setLatitude(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getLongitude" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getLongitude([])")
        
            // 开始调用
            val result = ref.getLongitude()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setLongitude" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setLongitude([\"var1\":$var1])")
        
            // 开始调用
            ref.setLongitude(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getSatellites" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getSatellites([])")
        
            // 开始调用
            val result = ref.getSatellites()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setSatellites" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setSatellites([\"var1\":$var1])")
        
            // 开始调用
            ref.setSatellites(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getStreet" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getStreet([])")
        
            // 开始调用
            val result = ref.getStreet()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setStreet" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setStreet([\"var1\":$var1])")
        
            // 开始调用
            ref.setStreet(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getStreetNum" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getStreetNum([])")
        
            // 开始调用
            val result = ref.getStreetNum()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setNumber" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setNumber([\"var1\":$var1])")
        
            // 开始调用
            ref.setNumber(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::setOffset" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setOffset([\"var1\":$var1])")
        
            // 开始调用
            ref.setOffset(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::isOffset" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::isOffset([])")
        
            // 开始调用
            val result = ref.isOffset()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::getAoiName" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getAoiName([])")
        
            // 开始调用
            val result = ref.getAoiName()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setAoiName" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setAoiName([\"var1\":$var1])")
        
            // 开始调用
            ref.setAoiName(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getBuildingId" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getBuildingId([])")
        
            // 开始调用
            val result = ref.getBuildingId()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setBuildingId" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setBuildingId([\"var1\":$var1])")
        
            // 开始调用
            ref.setBuildingId(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getFloor" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getFloor([])")
        
            // 开始调用
            val result = ref.getFloor()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::isFixLastLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::isFixLastLocation([])")
        
            // 开始调用
            val result = ref.isFixLastLocation()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setFixLastLocation" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setFixLastLocation([\"var1\":$var1])")
        
            // 开始调用
            ref.setFixLastLocation(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::setFloor" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setFloor([\"var1\":$var1])")
        
            // 开始调用
            ref.setFloor(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::isMock" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::isMock([])")
        
            // 开始调用
            val result = ref.isMock()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setMock" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setMock([\"var1\":$var1])")
        
            // 开始调用
            ref.setMock(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getDescription" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getDescription([])")
        
            // 开始调用
            val result = ref.getDescription()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setDescription" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setDescription([\"var1\":$var1])")
        
            // 开始调用
            ref.setDescription(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::toStr" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::toStr([])")
        
            // 开始调用
            val result = ref.toStr()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::getAccuracy" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getAccuracy([])")
        
            // 开始调用
            val result = ref.getAccuracy()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::getBearing" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getBearing([])")
        
            // 开始调用
            val result = ref.getBearing()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::getAltitude" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getAltitude([])")
        
            // 开始调用
            val result = ref.getAltitude()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::getSpeed" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getSpeed([])")
        
            // 开始调用
            val result = ref.getSpeed()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::getProvider" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getProvider([])")
        
            // 开始调用
            val result = ref.getProvider()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::clone" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::clone([])")
        
            // 开始调用
            val result = ref.clone()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocation::getLocationQualityReport" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getLocationQualityReport([])")
        
            // 开始调用
            val result = ref.getLocationQualityReport()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocation::setLocationQualityReport" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocationQualityReport
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setLocationQualityReport([])")
        
            // 开始调用
            ref.setLocationQualityReport(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getCoordType" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getCoordType([])")
        
            // 开始调用
            val result = ref.getCoordType()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setCoordType" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setCoordType([\"var1\":$var1])")
        
            // 开始调用
            ref.setCoordType(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::setTrustedLevel" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setTrustedLevel([\"var1\":$var1])")
        
            // 开始调用
            ref.setTrustedLevel(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocation::getTrustedLevel" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getTrustedLevel([])")
        
            // 开始调用
            val result = ref.getTrustedLevel()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::getConScenario" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::getConScenario([])")
        
            // 开始调用
            val result = ref.getConScenario()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocation::setConScenario" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocation
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocation@$refId::setConScenario([\"var1\":$var1])")
        
            // 开始调用
            ref.setConScenario(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClientOption::getAPIKEY" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption::getAPIKEY([])")
        
            // 开始调用
            val result = com.amap.api.location.AMapLocationClientOption.getAPIKEY()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::isMockEnable" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isMockEnable([])")
        
            // 开始调用
            val result = ref.isMockEnable()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setMockEnable" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setMockEnable([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setMockEnable(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::getInterval" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getInterval([])")
        
            // 开始调用
            val result = ref.getInterval()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setInterval" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Long
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setInterval([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setInterval(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isOnceLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isOnceLocation([])")
        
            // 开始调用
            val result = ref.isOnceLocation()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setOnceLocation" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setOnceLocation([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setOnceLocation(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isNeedAddress" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isNeedAddress([])")
        
            // 开始调用
            val result = ref.isNeedAddress()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setNeedAddress" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setNeedAddress([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setNeedAddress(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isWifiActiveScan" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isWifiActiveScan([])")
        
            // 开始调用
            val result = ref.isWifiActiveScan()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setWifiActiveScan" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setWifiActiveScan([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setWifiActiveScan(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isWifiScan" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isWifiScan([])")
        
            // 开始调用
            val result = ref.isWifiScan()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setWifiScan" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setWifiScan([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setWifiScan(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::getLocationMode" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getLocationMode([])")
        
            // 开始调用
            val result = ref.getLocationMode()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::setLocationMode" to { registrar, args, methodResult ->
            // 参数
            // 枚举参数
            val var1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.values()[args["var1"] as Int]
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setLocationMode([])")
        
            // 开始调用
            val result = ref.setLocationMode(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::getLocationProtocol" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getLocationProtocol([])")
        
            // 开始调用
            val result = ref.getLocationProtocol()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::setLocationProtocol" to { registrar, args, methodResult ->
            // 参数
            // 枚举参数
            val var0 = com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol.values()[args["var0"] as Int]
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption::setLocationProtocol([])")
        
            // 开始调用
            com.amap.api.location.AMapLocationClientOption.setLocationProtocol(var0)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClientOption::isKillProcess" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isKillProcess([])")
        
            // 开始调用
            val result = ref.isKillProcess()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setKillProcess" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setKillProcess([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setKillProcess(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isGpsFirst" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isGpsFirst([])")
        
            // 开始调用
            val result = ref.isGpsFirst()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setGpsFirst" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setGpsFirst([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setGpsFirst(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::setGpsFirstTimeout" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Long
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setGpsFirstTimeout([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setGpsFirstTimeout(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::getGpsFirstTimeout" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getGpsFirstTimeout([])")
        
            // 开始调用
            val result = ref.getGpsFirstTimeout()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::clone" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::clone([])")
        
            // 开始调用
            val result = ref.clone()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::getHttpTimeOut" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getHttpTimeOut([])")
        
            // 开始调用
            val result = ref.getHttpTimeOut()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setHttpTimeOut" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Long
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setHttpTimeOut([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setHttpTimeOut(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isOffset" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isOffset([])")
        
            // 开始调用
            val result = ref.isOffset()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setOffset" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setOffset([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setOffset(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isLocationCacheEnable" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isLocationCacheEnable([])")
        
            // 开始调用
            val result = ref.isLocationCacheEnable()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setLocationCacheEnable" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setLocationCacheEnable([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setLocationCacheEnable(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isOnceLocationLatest" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isOnceLocationLatest([])")
        
            // 开始调用
            val result = ref.isOnceLocationLatest()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setOnceLocationLatest" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setOnceLocationLatest([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setOnceLocationLatest(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isSensorEnable" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::isSensorEnable([])")
        
            // 开始调用
            val result = ref.isSensorEnable()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setSensorEnable" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setSensorEnable([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setSensorEnable(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::setLastLocationLifeCycle" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Long
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setLastLocationLifeCycle([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setLastLocationLifeCycle(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::getLastLocationLifeCycle" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getLastLocationLifeCycle([])")
        
            // 开始调用
            val result = ref.getLastLocationLifeCycle()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::getGeoLanguage" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getGeoLanguage([])")
        
            // 开始调用
            val result = ref.getGeoLanguage()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::setGeoLanguage" to { registrar, args, methodResult ->
            // 参数
            // 枚举参数
            val var1 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.values()[args["var1"] as Int]
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setGeoLanguage([])")
        
            // 开始调用
            val result = ref.setGeoLanguage(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::setDownloadCoordinateConvertLibrary" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as Boolean
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption::setDownloadCoordinateConvertLibrary([\"var0\":$var0])")
        
            // 开始调用
            com.amap.api.location.AMapLocationClientOption.setDownloadCoordinateConvertLibrary(var0)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClientOption::isDownloadCoordinateConvertLibrary" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption::isDownloadCoordinateConvertLibrary([])")
        
            // 开始调用
            val result = com.amap.api.location.AMapLocationClientOption.isDownloadCoordinateConvertLibrary()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::getDeviceModeDistanceFilter" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getDeviceModeDistanceFilter([])")
        
            // 开始调用
            val result = ref.getDeviceModeDistanceFilter()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setDeviceModeDistanceFilter" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setDeviceModeDistanceFilter([\"var1\":$var1])")
        
            // 开始调用
            val result = ref.setDeviceModeDistanceFilter(var1.toFloat())
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::setLocationPurpose" to { registrar, args, methodResult ->
            // 参数
            // 枚举参数
            val var1 = com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.values()[args["var1"] as Int]
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::setLocationPurpose([])")
        
            // 开始调用
            val result = ref.setLocationPurpose(var1)
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::getLocationPurpose" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getLocationPurpose([])")
        
            // 开始调用
            val result = ref.getLocationPurpose()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.location.AMapLocationClientOption::isOpenAlwaysScanWifi" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption::isOpenAlwaysScanWifi([])")
        
            // 开始调用
            val result = com.amap.api.location.AMapLocationClientOption.isOpenAlwaysScanWifi()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationClientOption::setOpenAlwaysScanWifi" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as Boolean
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption::setOpenAlwaysScanWifi([\"var0\":$var0])")
        
            // 开始调用
            com.amap.api.location.AMapLocationClientOption.setOpenAlwaysScanWifi(var0)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClientOption::setScanWifiInterval" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var0 = args["var0"] as Long
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption::setScanWifiInterval([\"var0\":$var0])")
        
            // 开始调用
            com.amap.api.location.AMapLocationClientOption.setScanWifiInterval(var0)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationClientOption::getScanWifiInterval" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationClientOption
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationClientOption@$refId::getScanWifiInterval([])")
        
            // 开始调用
            val result = ref.getScanWifiInterval()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.APSServiceBase::onCreate" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.APSServiceBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.APSServiceBase@$refId::onCreate([])")
        
            // 开始调用
            ref.onCreate()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.APSServiceBase::onDestroy" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.APSServiceBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.APSServiceBase@$refId::onDestroy([])")
        
            // 开始调用
            ref.onDestroy()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::setWifiAble" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::setWifiAble([\"var1\":$var1])")
        
            // 开始调用
            ref.setWifiAble(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::setGpsStatus" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::setGpsStatus([\"var1\":$var1])")
        
            // 开始调用
            ref.setGpsStatus(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::setGPSSatellites" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::setGPSSatellites([\"var1\":$var1])")
        
            // 开始调用
            ref.setGPSSatellites(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::isWifiAble" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::isWifiAble([])")
        
            // 开始调用
            val result = ref.isWifiAble()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationQualityReport::getGPSStatus" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::getGPSStatus([])")
        
            // 开始调用
            val result = ref.getGPSStatus()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationQualityReport::getGPSSatellites" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::getGPSSatellites([])")
        
            // 开始调用
            val result = ref.getGPSSatellites()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationQualityReport::getNetworkType" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::getNetworkType([])")
        
            // 开始调用
            val result = ref.getNetworkType()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationQualityReport::setNetworkType" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::setNetworkType([\"var1\":$var1])")
        
            // 开始调用
            ref.setNetworkType(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::getNetUseTime" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::getNetUseTime([])")
        
            // 开始调用
            val result = ref.getNetUseTime()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationQualityReport::setNetUseTime" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Long
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::setNetUseTime([\"var1\":$var1])")
        
            // 开始调用
            ref.setNetUseTime(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::setInstallHighDangerMockApp" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::setInstallHighDangerMockApp([\"var1\":$var1])")
        
            // 开始调用
            ref.setInstallHighDangerMockApp(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::isInstalledHighDangerMockApp" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::isInstalledHighDangerMockApp([])")
        
            // 开始调用
            val result = ref.isInstalledHighDangerMockApp()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.location.AMapLocationQualityReport::setLocationMode" to { registrar, args, methodResult ->
            // 参数
            // 枚举参数
            val var1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.values()[args["var1"] as Int]
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::setLocationMode([])")
        
            // 开始调用
            ref.setLocationMode(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.location.AMapLocationQualityReport::getAdviseMessage" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.location.AMapLocationQualityReport
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.location.AMapLocationQualityReport@$refId::getAdviseMessage([])")
        
            // 开始调用
            val result = ref.getAdviseMessage()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.DistrictItem::getCitycode" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::getCitycode([])")
        
            // 开始调用
            val result = ref.getCitycode()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.DistrictItem::setCitycode" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::setCitycode([\"var1\":$var1])")
        
            // 开始调用
            ref.setCitycode(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.DistrictItem::getAdcode" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::getAdcode([])")
        
            // 开始调用
            val result = ref.getAdcode()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.DistrictItem::setAdcode" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::setAdcode([\"var1\":$var1])")
        
            // 开始调用
            ref.setAdcode(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.DistrictItem::getPolyline" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::getPolyline([])")
        
            // 开始调用
            val result = ref.getPolyline()
        
            // 调用结果
            if (result != null) {
                for (item in result) {
                    HEAP[item.hashCode()] = item
                }
                methodResult.success(result.map { it.hashCode() })
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.DistrictItem::setPolyline" to { registrar, args, methodResult ->
            // 参数
            // 列表参数
            val var1 = (args["var1"] as List<Int>).map { HEAP[it] as com.amap.api.location.DPoint }
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::setPolyline([])")
        
            // 开始调用
            ref.setPolyline(ArrayList(var1))
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.DistrictItem::getDistrictName" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::getDistrictName([])")
        
            // 开始调用
            val result = ref.getDistrictName()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.DistrictItem::setDistrictName" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.DistrictItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem@$refId::setDistrictName([\"var1\":$var1])")
        
            // 开始调用
            ref.setDistrictName(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.DistrictItem::getCreator" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.DistrictItem::getCreator([])")
        
            // 开始调用
            val result = com.amap.api.fence.DistrictItem.getCreator()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFenceClient::setActivateAction" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::setActivateAction([\"var1\":$var1])")
        
            // 开始调用
            ref.setActivateAction(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceClient::setGeoFenceListener" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::setGeoFenceListener([])")
        
            // 开始调用
            ref.setGeoFenceListener(object : com.amap.api.fence.GeoFenceListener {
                // method channel
                val callbackChannel = MethodChannel(registrar.messenger(), "com.amap.api.fence.GeoFenceClient::setGeoFenceListener::Callback")
        
                // 回调方法们
                override fun onGeoFenceCreateFinished(var1: List<com.amap.api.fence.GeoFence>, var2: Int, var3: String): Unit {
                    // 日志打印
                    println("fluttify-kotlin-callback: onGeoFenceCreateFinished([\"var1\":$var1, \"var2\":$var2, \"var3\":$var3])")
        
                    // 处理成可以传输的参数
                    val argvar1 = var1.map { it.apply { HEAP[it.hashCode()] = it }.hashCode() }
                    val argvar2 = var2
                    val argvar3 = var3
        
                    // 开始回调
                    callbackChannel.invokeMethod(
                        "Callback::com.amap.api.fence.GeoFenceListener::onGeoFenceCreateFinished",
                        mapOf<String, Any?>(
                            "var1" to argvar1,
                            "var2" to argvar2,
                            "var3" to argvar3
                        )
                    )
        
                    // 方法返回值
        
                }
        
            })
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceClient::addGeoFence" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.DPoint
            // jsonable参数
            val var2 = args["var2"] as Double
            // jsonable参数
            val var3 = args["var3"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::addGeoFence([\"var2\":$var2, \"var3\":$var3])")
        
            // 开始调用
            ref.addGeoFence(var1, var2.toFloat(), var3)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceClient::removeGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::removeGeoFence([])")
        
            // 开始调用
            ref.removeGeoFence()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceClient::getAllGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::getAllGeoFence([])")
        
            // 开始调用
            val result = ref.getAllGeoFence()
        
            // 调用结果
            if (result != null) {
                for (item in result) {
                    HEAP[item.hashCode()] = item
                }
                methodResult.success(result.map { it.hashCode() })
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFenceClient::setGeoFenceAble" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
            // jsonable参数
            val var2 = args["var2"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::setGeoFenceAble([\"var1\":$var1, \"var2\":$var2])")
        
            // 开始调用
            ref.setGeoFenceAble(var1, var2)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceClient::pauseGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::pauseGeoFence([])")
        
            // 开始调用
            ref.pauseGeoFence()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceClient::resumeGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::resumeGeoFence([])")
        
            // 开始调用
            ref.resumeGeoFence()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceClient::isPause" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceClient
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceClient@$refId::isPause([])")
        
            // 开始调用
            val result = ref.isPause()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFenceListener::onGeoFenceCreateFinished" to { registrar, args, methodResult ->
            // 参数
            // 列表参数
            val var1 = (args["var1"] as List<Int>).map { HEAP[it] as com.amap.api.fence.GeoFence }
            // jsonable参数
            val var2 = args["var2"] as Int
            // jsonable参数
            val var3 = args["var3"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceListener
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceListener@$refId::onGeoFenceCreateFinished([\"var2\":$var2, \"var3\":$var3])")
        
            // 开始调用
            ref.onGeoFenceCreateFinished(ArrayList(var1), var2, var3)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getFenceId" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getFenceId([])")
        
            // 开始调用
            val result = ref.getFenceId()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setFenceId" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setFenceId([\"var1\":$var1])")
        
            // 开始调用
            ref.setFenceId(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getCustomId" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getCustomId([])")
        
            // 开始调用
            val result = ref.getCustomId()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setCustomId" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setCustomId([\"var1\":$var1])")
        
            // 开始调用
            ref.setCustomId(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getPendingIntentAction" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getPendingIntentAction([])")
        
            // 开始调用
            val result = ref.getPendingIntentAction()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setPendingIntentAction" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setPendingIntentAction([\"var1\":$var1])")
        
            // 开始调用
            ref.setPendingIntentAction(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getType" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getType([])")
        
            // 开始调用
            val result = ref.getType()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setType" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setType([\"var1\":$var1])")
        
            // 开始调用
            ref.setType(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getPoiItem" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getPoiItem([])")
        
            // 开始调用
            val result = ref.getPoiItem()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFence::setPoiItem" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.fence.PoiItem
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setPoiItem([])")
        
            // 开始调用
            ref.setPoiItem(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getDistrictItemList" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getDistrictItemList([])")
        
            // 开始调用
            val result = ref.getDistrictItemList()
        
            // 调用结果
            if (result != null) {
                for (item in result) {
                    HEAP[item.hashCode()] = item
                }
                methodResult.success(result.map { it.hashCode() })
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFence::setDistrictItemList" to { registrar, args, methodResult ->
            // 参数
            // 列表参数
            val var1 = (args["var1"] as List<Int>).map { HEAP[it] as com.amap.api.fence.DistrictItem }
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setDistrictItemList([])")
        
            // 开始调用
            ref.setDistrictItemList(ArrayList(var1))
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getPointList" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getPointList([])")
        
            // 开始调用
            val result = ref.getPointList()
        
            // 调用结果
            if (result != null) {
                for (item in result) {
                    HEAP[item.hashCode()] = item
                }
                methodResult.success(result.map { it.hashCode() })
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFence::setPointList" to { registrar, args, methodResult ->
            // 参数
            val var1 = listOf<List<com.amap.api.location.DPoint>>()
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setPointList([])")
        
            // 开始调用
            ref.setPointList(ArrayList(var1))
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getRadius" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getRadius([])")
        
            // 开始调用
            val result = ref.getRadius()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setRadius" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setRadius([\"var1\":$var1])")
        
            // 开始调用
            ref.setRadius(var1.toFloat())
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getExpiration" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getExpiration([])")
        
            // 开始调用
            val result = ref.getExpiration()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setExpiration" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Long
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setExpiration([\"var1\":$var1])")
        
            // 开始调用
            ref.setExpiration(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getActivatesAction" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getActivatesAction([])")
        
            // 开始调用
            val result = ref.getActivatesAction()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setActivatesAction" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setActivatesAction([\"var1\":$var1])")
        
            // 开始调用
            ref.setActivatesAction(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getStatus" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getStatus([])")
        
            // 开始调用
            val result = ref.getStatus()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setStatus" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setStatus([\"var1\":$var1])")
        
            // 开始调用
            ref.setStatus(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getEnterTime" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getEnterTime([])")
        
            // 开始调用
            val result = ref.getEnterTime()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setEnterTime" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Long
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setEnterTime([\"var1\":$var1])")
        
            // 开始调用
            ref.setEnterTime(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getCenter" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getCenter([])")
        
            // 开始调用
            val result = ref.getCenter()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFence::setCenter" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.DPoint
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setCenter([])")
        
            // 开始调用
            ref.setCenter(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getMinDis2Center" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getMinDis2Center([])")
        
            // 开始调用
            val result = ref.getMinDis2Center()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setMinDis2Center" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setMinDis2Center([\"var1\":$var1])")
        
            // 开始调用
            ref.setMinDis2Center(var1.toFloat())
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getMaxDis2Center" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getMaxDis2Center([])")
        
            // 开始调用
            val result = ref.getMaxDis2Center()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setMaxDis2Center" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setMaxDis2Center([\"var1\":$var1])")
        
            // 开始调用
            ref.setMaxDis2Center(var1.toFloat())
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::isAble" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::isAble([])")
        
            // 开始调用
            val result = ref.isAble()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.GeoFence::setAble" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setAble([\"var1\":$var1])")
        
            // 开始调用
            ref.setAble(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::setCurrentLocation" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.AMapLocation
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::setCurrentLocation([])")
        
            // 开始调用
            ref.setCurrentLocation(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFence::getCurrentLocation" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFence
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFence@$refId::getCurrentLocation([])")
        
            // 开始调用
            val result = ref.getCurrentLocation()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFenceManagerBase::setActivateAction" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Int
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::setActivateAction([\"var1\":$var1])")
        
            // 开始调用
            ref.setActivateAction(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::setGeoFenceListener" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::setGeoFenceListener([])")
        
            // 开始调用
            ref.setGeoFenceListener(object : com.amap.api.fence.GeoFenceListener {
                // method channel
                val callbackChannel = MethodChannel(registrar.messenger(), "com.amap.api.fence.GeoFenceManagerBase::setGeoFenceListener::Callback")
        
                // 回调方法们
                override fun onGeoFenceCreateFinished(var1: List<com.amap.api.fence.GeoFence>, var2: Int, var3: String): Unit {
                    // 日志打印
                    println("fluttify-kotlin-callback: onGeoFenceCreateFinished([\"var1\":$var1, \"var2\":$var2, \"var3\":$var3])")
        
                    // 处理成可以传输的参数
                    val argvar1 = var1.map { it.apply { HEAP[it.hashCode()] = it }.hashCode() }
                    val argvar2 = var2
                    val argvar3 = var3
        
                    // 开始回调
                    callbackChannel.invokeMethod(
                        "Callback::com.amap.api.fence.GeoFenceListener::onGeoFenceCreateFinished",
                        mapOf<String, Any?>(
                            "var1" to argvar1,
                            "var2" to argvar2,
                            "var3" to argvar3
                        )
                    )
        
                    // 方法返回值
        
                }
        
            })
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::addRoundGeoFence" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as com.amap.api.location.DPoint
            // jsonable参数
            val var2 = args["var2"] as Double
            // jsonable参数
            val var3 = args["var3"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::addRoundGeoFence([\"var2\":$var2, \"var3\":$var3])")
        
            // 开始调用
            ref.addRoundGeoFence(var1, var2.toFloat(), var3)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::addPolygonGeoFence" to { registrar, args, methodResult ->
            // 参数
            // 列表参数
            val var1 = (args["var1"] as List<Int>).map { HEAP[it] as com.amap.api.location.DPoint }
            // jsonable参数
            val var2 = args["var2"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::addPolygonGeoFence([\"var2\":$var2])")
        
            // 开始调用
            ref.addPolygonGeoFence(ArrayList(var1), var2)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::addNearbyGeoFence" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
            // jsonable参数
            val var2 = args["var2"] as String
            // 引用参数
            val var3 = HEAP[args["var3"] as Int] as com.amap.api.location.DPoint
            // jsonable参数
            val var4 = args["var4"] as Double
            // jsonable参数
            val var5 = args["var5"] as Int
            // jsonable参数
            val var6 = args["var6"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::addNearbyGeoFence([\"var1\":$var1, \"var2\":$var2, \"var4\":$var4, \"var5\":$var5, \"var6\":$var6])")
        
            // 开始调用
            ref.addNearbyGeoFence(var1, var2, var3, var4.toFloat(), var5, var6)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::addKeywordGeoFence" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
            // jsonable参数
            val var2 = args["var2"] as String
            // jsonable参数
            val var3 = args["var3"] as String
            // jsonable参数
            val var4 = args["var4"] as Int
            // jsonable参数
            val var5 = args["var5"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::addKeywordGeoFence([\"var1\":$var1, \"var2\":$var2, \"var3\":$var3, \"var4\":$var4, \"var5\":$var5])")
        
            // 开始调用
            ref.addKeywordGeoFence(var1, var2, var3, var4, var5)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::addDistrictGeoFence" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
            // jsonable参数
            val var2 = args["var2"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::addDistrictGeoFence([\"var1\":$var1, \"var2\":$var2])")
        
            // 开始调用
            ref.addDistrictGeoFence(var1, var2)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::removeGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::removeGeoFence([])")
        
            // 开始调用
            ref.removeGeoFence()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::getAllGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::getAllGeoFence([])")
        
            // 开始调用
            val result = ref.getAllGeoFence()
        
            // 调用结果
            if (result != null) {
                for (item in result) {
                    HEAP[item.hashCode()] = item
                }
                methodResult.success(result.map { it.hashCode() })
            } else {
                methodResult.success(null)
            }
        },
        "com.amap.api.fence.GeoFenceManagerBase::setGeoFenceAble" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
            // jsonable参数
            val var2 = args["var2"] as Boolean
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::setGeoFenceAble([\"var1\":$var1, \"var2\":$var2])")
        
            // 开始调用
            ref.setGeoFenceAble(var1, var2)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::pauseGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::pauseGeoFence([])")
        
            // 开始调用
            ref.pauseGeoFence()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::resumeGeoFence" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::resumeGeoFence([])")
        
            // 开始调用
            ref.resumeGeoFence()
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.GeoFenceManagerBase::isPause" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.GeoFenceManagerBase
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.GeoFenceManagerBase@$refId::isPause([])")
        
            // 开始调用
            val result = ref.isPause()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::getLatitude" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getLatitude([])")
        
            // 开始调用
            val result = ref.getLatitude()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setLatitude" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setLatitude([\"var1\":$var1])")
        
            // 开始调用
            ref.setLatitude(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getLongitude" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getLongitude([])")
        
            // 开始调用
            val result = ref.getLongitude()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setLongitude" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setLongitude([\"var1\":$var1])")
        
            // 开始调用
            ref.setLongitude(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getPoiId" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getPoiId([])")
        
            // 开始调用
            val result = ref.getPoiId()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setPoiId" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setPoiId([\"var1\":$var1])")
        
            // 开始调用
            ref.setPoiId(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getPoiType" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getPoiType([])")
        
            // 开始调用
            val result = ref.getPoiType()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setPoiType" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setPoiType([\"var1\":$var1])")
        
            // 开始调用
            ref.setPoiType(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getTypeCode" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getTypeCode([])")
        
            // 开始调用
            val result = ref.getTypeCode()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setTypeCode" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setTypeCode([\"var1\":$var1])")
        
            // 开始调用
            ref.setTypeCode(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getAddress" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getAddress([])")
        
            // 开始调用
            val result = ref.getAddress()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setAddress" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setAddress([\"var1\":$var1])")
        
            // 开始调用
            ref.setAddress(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getTel" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getTel([])")
        
            // 开始调用
            val result = ref.getTel()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setTel" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setTel([\"var1\":$var1])")
        
            // 开始调用
            ref.setTel(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getProvince" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getProvince([])")
        
            // 开始调用
            val result = ref.getProvince()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setProvince" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setProvince([\"var1\":$var1])")
        
            // 开始调用
            ref.setProvince(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getCity" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getCity([])")
        
            // 开始调用
            val result = ref.getCity()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setCity" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setCity([\"var1\":$var1])")
        
            // 开始调用
            ref.setCity(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getAdname" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getAdname([])")
        
            // 开始调用
            val result = ref.getAdname()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::getPoiName" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::getPoiName([])")
        
            // 开始调用
            val result = ref.getPoiName()
        
            // 调用结果
            methodResult.success(result)
        },
        "com.amap.api.fence.PoiItem::setPoiName" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setPoiName([\"var1\":$var1])")
        
            // 开始调用
            ref.setPoiName(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::setAdname" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 调用对象引用
            val refId = args["refId"] as Int
            val ref = HEAP[refId] as com.amap.api.fence.PoiItem
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem@$refId::setAdname([\"var1\":$var1])")
        
            // 开始调用
            ref.setAdname(var1)
        
            // 调用结果
            methodResult.success("success")
        },
        "com.amap.api.fence.PoiItem::getCreator" to { registrar, args, methodResult ->
            // 参数
        
        
            // 调用对象引用
        
        
            // 日志打印
            println("fluttify-kotlin: com.amap.api.fence.PoiItem::getCreator([])")
        
            // 开始调用
            val result = com.amap.api.fence.PoiItem.getCreator()
        
            // 调用结果
            if (result != null) {
                val returnRefId = result.hashCode()
                HEAP[returnRefId] = result
        
                methodResult.success(returnRefId)
            } else {
                methodResult.success(null)
            }
        },
        "ObjectFactory::createcom_autonavi_aps_amapapi_model_AMapLocationServer__String" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 创建对象
            val obj = com.autonavi.aps.amapapi.model.AMapLocationServer(var1)
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_AMapLocationClient__android_content_Context" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as android.content.Context
        
            // 创建对象
            val obj = com.amap.api.location.AMapLocationClient(var1)
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_DPoint__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.location.DPoint()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_DPoint__double__double" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as Double
            // jsonable参数
            val var3 = args["var3"] as Double
        
            // 创建对象
            val obj = com.amap.api.location.DPoint(var1, var3)
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_CoordinateConverter__android_content_Context" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as android.content.Context
        
            // 创建对象
            val obj = com.amap.api.location.CoordinateConverter(var1)
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_CoordUtil__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.location.CoordUtil()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_UmidtokenInfo__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.location.UmidtokenInfo()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_AMapLocation__String" to { registrar, args, methodResult ->
            // 参数
            // jsonable参数
            val var1 = args["var1"] as String
        
            // 创建对象
            val obj = com.amap.api.location.AMapLocation(var1)
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_AMapLocation__android_location_Location" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as android.location.Location
        
            // 创建对象
            val obj = com.amap.api.location.AMapLocation(var1)
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_AMapLocationClientOption__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.location.AMapLocationClientOption()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_location_AMapLocationQualityReport__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.location.AMapLocationQualityReport()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_fence_DistrictItem__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.fence.DistrictItem()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_fence_GeoFenceClient__android_content_Context" to { registrar, args, methodResult ->
            // 参数
            // 引用参数
            val var1 = HEAP[args["var1"] as Int] as android.content.Context
        
            // 创建对象
            val obj = com.amap.api.fence.GeoFenceClient(var1)
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_fence_GeoFence__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.fence.GeoFence()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        ,
        "ObjectFactory::createcom_amap_api_fence_PoiItem__" to { registrar, args, methodResult ->
            // 参数
        
        
            // 创建对象
            val obj = com.amap.api.fence.PoiItem()
            HEAP[obj.hashCode()] = obj
        
            methodResult.success(obj.hashCode())
        }
        
    )

    override fun onMethodCall(methodCall: MethodCall, methodResult: MethodChannel.Result) {
        val args = methodCall.arguments as? Map<String, Any> ?: mapOf()
        when (methodCall.method) {
            // 获取Application对象
            "ObjectFactory::getandroid_app_Application" -> {
                methodResult.success(registrar.activity().application.apply { HEAP[hashCode()] = this }.hashCode())
            }
            // 获取FlutterActivity对象
            "ObjectFactory::getandroid_app_Activity" -> {
                methodResult.success(registrar.activity().apply { HEAP[hashCode()] = this }.hashCode())
            }
            // 创建android.os.Bundle对象
            "ObjectFactory::createandroid_os_Bundle" -> {
                methodResult.success(Bundle().apply { HEAP[hashCode()] = this }.hashCode())
            }
            // 释放一个对象
            "ObjectFactory::release" -> {
                HEAP.remove(args["refId"] as Int)
                methodResult.success("success")
            }
            // 清空HEAP中所有对象
            "ObjectFactory::clearRefMap" -> {
                HEAP.clear()
                methodResult.success("success")
            }
            else -> {
                handlerMap[methodCall.method]?.invoke(registrar, args, methodResult) ?: methodResult.notImplemented()
            }
        }
    }
}
