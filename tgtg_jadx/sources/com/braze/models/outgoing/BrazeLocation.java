package com.braze.models.outgoing;

import android.location.Location;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0011R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0011R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0014R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0014R\u0016\u00101\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0014¨\u00064"}, d2 = {"Lcom/braze/models/outgoing/BrazeLocation;", "Lcom/braze/models/IBrazeLocation;", "", "_latitude", "_longitude", "_altitude", "_accuracy", "_verticalAccuracy", "<init>", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "Landroid/location/Location;", "location", "(Landroid/location/Location;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)V", "component1", "()D", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "forJsonPut", "()Lorg/json/JSONObject;", "copy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/braze/models/outgoing/BrazeLocation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "Ljava/lang/Double;", "getLatitude", "latitude", "getLongitude", "longitude", "getAltitude", IBrazeLocation.ALTITUDE, "getAccuracy", "accuracy", "getVerticalAccuracy", "verticalAccuracy", "Companion", "com/braze/models/outgoing/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BrazeLocation implements IBrazeLocation {
    private static final c Companion = new c();
    private final Double _accuracy;
    private final Double _altitude;
    private final double _latitude;
    private final double _longitude;
    private final Double _verticalAccuracy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasAccuracy() ? Double.valueOf(location.getAccuracy()) : null, c.a(Companion, location));
        location.getClass();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final double get_latitude() {
        return this._latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final double get_longitude() {
        return this._longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final Double get_altitude() {
        return this._altitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final Double get_accuracy() {
        return this._accuracy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final Double get_verticalAccuracy() {
        return this._verticalAccuracy;
    }

    public static /* synthetic */ BrazeLocation copy$default(BrazeLocation brazeLocation, double d3, double d11, Double d12, Double d13, Double d14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d3 = brazeLocation._latitude;
        }
        double d15 = d3;
        if ((i11 & 2) != 0) {
            d11 = brazeLocation._longitude;
        }
        double d16 = d11;
        if ((i11 & 4) != 0) {
            d12 = brazeLocation._altitude;
        }
        Double d17 = d12;
        if ((i11 & 8) != 0) {
            d13 = brazeLocation._accuracy;
        }
        Double d18 = d13;
        if ((i11 & 16) != 0) {
            d14 = brazeLocation._verticalAccuracy;
        }
        return brazeLocation.copy(d15, d16, d17, d18, d14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Caught exception creating location Json.";
    }

    public final BrazeLocation copy(double _latitude, double _longitude, Double _altitude, Double _accuracy, Double _verticalAccuracy) {
        return new BrazeLocation(_latitude, _longitude, _altitude, _accuracy, _verticalAccuracy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrazeLocation)) {
            return false;
        }
        BrazeLocation brazeLocation = (BrazeLocation) other;
        return Double.compare(this._latitude, brazeLocation._latitude) == 0 && Double.compare(this._longitude, brazeLocation._longitude) == 0 && Intrinsics.areEqual((Object) this._altitude, (Object) brazeLocation._altitude) && Intrinsics.areEqual((Object) this._accuracy, (Object) brazeLocation._accuracy) && Intrinsics.areEqual((Object) this._verticalAccuracy, (Object) brazeLocation._verticalAccuracy);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", getLatitude());
            jSONObject.put("longitude", getLongitude());
            if (getAltitude() != null) {
                jSONObject.put(IBrazeLocation.ALTITUDE, getAltitude());
            }
            if (getAccuracy() != null) {
                jSONObject.put(IBrazeLocation.ACCURACY, getAccuracy());
            }
            if (getVerticalAccuracy() != null) {
                jSONObject.put(IBrazeLocation.VERTICAL_ACCURACY, getVerticalAccuracy());
            }
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new cu.a(10), 4, (Object) null);
            return jSONObject;
        }
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAccuracy() {
        return this._accuracy;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAltitude() {
        return this._altitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLatitude() {
        return this._latitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLongitude() {
        return this._longitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getVerticalAccuracy() {
        return this._verticalAccuracy;
    }

    public int hashCode() {
        int iB = s.b(this._longitude, Double.hashCode(this._latitude) * 31, 31);
        Double d3 = this._altitude;
        int iHashCode = (iB + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d11 = this._accuracy;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this._verticalAccuracy;
        return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this._latitude + ", _longitude=" + this._longitude + ", _altitude=" + this._altitude + ", _accuracy=" + this._accuracy + ", _verticalAccuracy=" + this._verticalAccuracy + ")";
    }

    public BrazeLocation(double d3, double d11, Double d12) {
        this(d3, d11, d12, null, null, 24, null);
    }

    public BrazeLocation(double d3, double d11, Double d12, Double d13) {
        this(d3, d11, d12, d13, null, 16, null);
    }

    public BrazeLocation(double d3, double d11, Double d12, Double d13, Double d14) {
        this._latitude = d3;
        this._longitude = d11;
        this._altitude = d12;
        this._accuracy = d13;
        this._verticalAccuracy = d14;
        if (ValidationUtils.isValidLocation(getLatitude(), getLongitude())) {
            return;
        }
        i4.a.f("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively");
        throw null;
    }

    public /* synthetic */ BrazeLocation(double d3, double d11, Double d12, Double d13, Double d14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, d11, (i11 & 4) != 0 ? null : d12, (i11 & 8) != 0 ? null : d13, (i11 & 16) != 0 ? null : d14);
    }

    public BrazeLocation(double d3, double d11) {
        this(d3, d11, null, null, null, 28, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(JSONObject jSONObject) {
        this(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"), JsonUtils.getDoubleOrNull(jSONObject, IBrazeLocation.ALTITUDE), JsonUtils.getDoubleOrNull(jSONObject, IBrazeLocation.ACCURACY), JsonUtils.getDoubleOrNull(jSONObject, IBrazeLocation.VERTICAL_ACCURACY));
        jSONObject.getClass();
    }
}
