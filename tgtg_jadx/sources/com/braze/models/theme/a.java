package com.braze.models.theme;

import b3.i;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f10282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f10285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f10286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f10287g;

    public a(JSONObject jSONObject) {
        jSONObject.getClass();
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.BG_COLOR);
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.MESSAGE_TEXT_COLOR);
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(jSONObject, "close_btn_color");
        Integer colorIntegerOrNull4 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.ICON_COLOR);
        Integer colorIntegerOrNull5 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.ICON_BG_COLOR);
        Integer colorIntegerOrNull6 = JsonUtils.getColorIntegerOrNull(jSONObject, "header_text_color");
        Integer colorIntegerOrNull7 = JsonUtils.getColorIntegerOrNull(jSONObject, "frame_color");
        this.f10281a = colorIntegerOrNull;
        this.f10282b = colorIntegerOrNull2;
        this.f10283c = colorIntegerOrNull3;
        this.f10284d = colorIntegerOrNull4;
        this.f10285e = colorIntegerOrNull5;
        this.f10286f = colorIntegerOrNull6;
        this.f10287g = colorIntegerOrNull7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f10281a, aVar.f10281a) && Intrinsics.areEqual(this.f10282b, aVar.f10282b) && Intrinsics.areEqual(this.f10283c, aVar.f10283c) && Intrinsics.areEqual(this.f10284d, aVar.f10284d) && Intrinsics.areEqual(this.f10285e, aVar.f10285e) && Intrinsics.areEqual(this.f10286f, aVar.f10286f) && Intrinsics.areEqual(this.f10287g, aVar.f10287g);
    }

    public final int hashCode() {
        Integer num = this.f10281a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10282b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10283c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10284d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10285e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f10286f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f10287g;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f10281a;
        Integer num2 = this.f10282b;
        Integer num3 = this.f10283c;
        Integer num4 = this.f10284d;
        Integer num5 = this.f10285e;
        Integer num6 = this.f10286f;
        Integer num7 = this.f10287g;
        StringBuilder sb2 = new StringBuilder("InAppMessageTheme(backgroundColor=");
        sb2.append(num);
        sb2.append(", textColor=");
        sb2.append(num2);
        sb2.append(", closeButtonColor=");
        s.z(sb2, num3, ", iconColor=", num4, ", iconBackgroundColor=");
        s.z(sb2, num5, ", headerTextColor=", num6, ", frameColor=");
        return i.m(sb2, num7, ")");
    }
}
