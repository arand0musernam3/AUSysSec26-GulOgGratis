package ft;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.item.LatLngInfo;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f17905a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f17906b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SearchFilter f17907c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f17908d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f17909e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public st.b f17910f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17911g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17912h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f17913i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17914j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LatLngInfo f17915k = null;
    public String l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Float f17916m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BasketManager f17917n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f17918o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f17919p = null;

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Boolean bool = this.f17905a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 961;
        Double d3 = this.f17906b;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        SearchFilter searchFilter = this.f17907c;
        int iHashCode3 = (iHashCode2 + (searchFilter == null ? 0 : searchFilter.hashCode())) * 31;
        Boolean bool2 = this.f17908d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f17909e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        st.b bVar = this.f17910f;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f17911g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17912h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f17913i;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f17914j;
        int iM291hashCodeimpl = (iHashCode9 + (str3 == null ? 0 : UserId.m291hashCodeimpl(str3))) * 31;
        LatLngInfo latLngInfo = this.f17915k;
        int iHashCode10 = (iM291hashCodeimpl + (latLngInfo == null ? 0 : latLngInfo.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f11 = this.f17916m;
        int iHashCode12 = (iHashCode11 + (f11 == null ? 0 : f11.hashCode())) * 31;
        BasketManager basketManager = this.f17917n;
        int iHashCode13 = (iHashCode12 + (basketManager == null ? 0 : basketManager.hashCode())) * 31;
        String str5 = this.f17918o;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17919p;
        return iHashCode14 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f17905a;
        Double d3 = this.f17906b;
        SearchFilter searchFilter = this.f17907c;
        Boolean bool2 = this.f17908d;
        Boolean bool3 = this.f17909e;
        st.b bVar = this.f17910f;
        String str = this.f17911g;
        String str2 = this.f17912h;
        Long l = this.f17913i;
        String str3 = this.f17914j;
        String strM292toStringimpl = str3 == null ? Address.ADDRESS_NULL_PLACEHOLDER : UserId.m292toStringimpl(str3);
        LatLngInfo latLngInfo = this.f17915k;
        String str4 = this.l;
        Float f11 = this.f17916m;
        BasketManager basketManager = this.f17917n;
        String str5 = this.f17918o;
        String str6 = this.f17919p;
        StringBuilder sb2 = new StringBuilder("LibFileCache(calendarPermissionPermanentlyDenied=");
        sb2.append(bool);
        sb2.append(", c2cAlwaysOnCardInitialDate=null, dynamicLocationPickerRadius=");
        sb2.append(d3);
        sb2.append(", filter=");
        sb2.append(searchFilter);
        sb2.append(", hasOrderToolTipBeenSeen=");
        sb2.append(bool2);
        sb2.append(", isBusinessMode=");
        sb2.append(bool3);
        sb2.append(", mapLocation=");
        sb2.append(bVar);
        sb2.append(", pushToken=");
        j4.s.A(sb2, str, ", searchMode=", str2, ", timeSkew=");
        sb2.append(l);
        sb2.append(", userId=");
        sb2.append(strM292toStringimpl);
        sb2.append(", userLocation=");
        sb2.append(latLngInfo);
        sb2.append(", userLocationName=");
        sb2.append(str4);
        sb2.append(", zoomLevel=");
        sb2.append(f11);
        sb2.append(", basketManager=");
        sb2.append(basketManager);
        sb2.append(", selectedLocationType=");
        return e0.f.o(sb2, str5, ", selectedLocation=", str6, ")");
    }
}
