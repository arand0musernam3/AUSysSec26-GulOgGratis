package com.braze.models.theme;

import b3.i;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f10289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10290c;

    public b(JSONObject jSONObject) {
        jSONObject.getClass();
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.BG_COLOR);
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.MESSAGE_TEXT_COLOR);
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(jSONObject, "border_color");
        this.f10288a = colorIntegerOrNull;
        this.f10289b = colorIntegerOrNull2;
        this.f10290c = colorIntegerOrNull3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f10288a, bVar.f10288a) && Intrinsics.areEqual(this.f10289b, bVar.f10289b) && Intrinsics.areEqual(this.f10290c, bVar.f10290c);
    }

    public final int hashCode() {
        Integer num = this.f10288a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10289b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10290c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f10288a;
        Integer num2 = this.f10289b;
        Integer num3 = this.f10290c;
        StringBuilder sb2 = new StringBuilder("MessageButtonTheme(backgroundColor=");
        sb2.append(num);
        sb2.append(", textColor=");
        sb2.append(num2);
        sb2.append(", borderColor=");
        return i.m(sb2, num3, ")");
    }
}
