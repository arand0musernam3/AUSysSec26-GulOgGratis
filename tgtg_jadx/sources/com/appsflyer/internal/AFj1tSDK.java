package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFj1tSDK implements SensorEventListener {
    private final int AFAdRevenueData;
    private long component1;

    @NonNull
    private final Executor component4;
    private double getCurrencyIso4217Code;

    @NonNull
    private final String getMediationNetwork;

    @NonNull
    private final String getMonetizationNetwork;
    private final int getRevenue;
    private final float[][] component2 = new float[2][];
    private final long[] areAllFieldsValid = new long[2];

    public AFj1tSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.AFAdRevenueData = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getMediationNetwork = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getRevenue = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.component4 = executorService;
    }

    private boolean AFAdRevenueData(int i11, @NonNull String str, @NonNull String str2) {
        return this.AFAdRevenueData == i11 && this.getMediationNetwork.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j9 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component2;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component2[1] = fArrCopyOf;
            this.areAllFieldsValid[1] = jCurrentTimeMillis;
            this.getCurrencyIso4217Code = getCurrencyIso4217Code(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j9 - this.component1) {
            this.component1 = j9;
            if (Arrays.equals(fArr4, fArr)) {
                this.areAllFieldsValid[1] = jCurrentTimeMillis;
                return;
            }
            double currencyIso4217Code = getCurrencyIso4217Code(fArr3, fArr);
            if (currencyIso4217Code > this.getCurrencyIso4217Code) {
                this.component2[1] = Arrays.copyOf(fArr, fArr.length);
                this.areAllFieldsValid[1] = jCurrentTimeMillis;
                this.getCurrencyIso4217Code = currencyIso4217Code;
            }
        }
    }

    private static double getCurrencyIso4217Code(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i11 = 0; i11 < iMin; i11++) {
            dPow += StrictMath.pow(fArr[i11] - fArr2[i11], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    @NonNull
    private Map<String, Object> getMonetizationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFAdRevenueData));
        concurrentHashMap.put("sN", this.getMediationNetwork);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.component2[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getMonetizationNetwork(fArr));
        }
        float[] fArr2 = this.component2[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getMonetizationNetwork(fArr2));
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1tSDK)) {
            return false;
        }
        AFj1tSDK aFj1tSDK = (AFj1tSDK) obj;
        return AFAdRevenueData(aFj1tSDK.AFAdRevenueData, aFj1tSDK.getMediationNetwork, aFj1tSDK.getMonetizationNetwork);
    }

    public final void getMediationNetwork(@NonNull Map<AFj1tSDK, Map<String, Object>> map, boolean z11) {
        if (!getMediationNetwork()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMonetizationNetwork());
            return;
        }
        map.put(this, getMonetizationNetwork());
        if (z11) {
            int length = this.component2.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.component2[i11] = null;
            }
            int length2 = this.areAllFieldsValid.length;
            for (int i12 = 0; i12 < length2; i12++) {
                this.areAllFieldsValid[i12] = 0;
            }
            this.getCurrencyIso4217Code = 0.0d;
            this.component1 = 0L;
        }
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component4.execute(new g(5, this, sensorEvent));
        } else {
            G_(sensorEvent);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @NonNull
    private static List<Float> getMonetizationNetwork(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    private boolean getMediationNetwork() {
        return this.component2[0] != null;
    }
}
