package com.braze.enums;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.LinkedHashMap;
import kotlin.collections.e0;
import kotlin.collections.w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements IPutIntoJson {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;
    public static final /* synthetic */ d[] J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f9707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f9708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f9709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f9710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f9711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f9712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f9713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f9714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f9715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f9716k;
    public static final d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f9717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f9718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f9719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f9720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f9721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f9722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f9723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f9724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f9725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f9726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f9727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f9728x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f9729y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f9730z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9731a;

    static {
        d dVar = new d("LOCATION_RECORDED", 0, "lr");
        f9709d = dVar;
        d dVar2 = new d("CUSTOM_EVENT", 1, "ce");
        f9710e = dVar2;
        d dVar3 = new d("PURCHASE", 2, Constants.BRAZE_PUSH_PRIORITY_KEY);
        f9711f = dVar3;
        d dVar4 = new d("PUSH_STORY_PAGE_CLICK", 3, "cic");
        f9712g = dVar4;
        d dVar5 = new d("PUSH_CLICKED", 4, "pc");
        f9713h = dVar5;
        d dVar6 = new d("PUSH_ACTION_BUTTON_CLICKED", 5, "ca");
        f9714i = dVar6;
        d dVar7 = new d("INTERNAL", 6, "i");
        d dVar8 = new d("INTERNAL_ERROR", 7, "ie");
        f9715j = dVar8;
        d dVar9 = new d("GEOFENCE", 8, "g");
        f9716k = dVar9;
        d dVar10 = new d("CONTENT_CARDS_CLICK", 9, "ccc");
        l = dVar10;
        d dVar11 = new d("CONTENT_CARDS_IMPRESSION", 10, "cci");
        f9717m = dVar11;
        d dVar12 = new d("CONTENT_CARDS_CONTROL_IMPRESSION", 11, "ccic");
        f9718n = dVar12;
        d dVar13 = new d("CONTENT_CARDS_DISMISS", 12, "ccd");
        f9719o = dVar13;
        d dVar14 = new d("INCREMENT", 13, "inc");
        f9720p = dVar14;
        d dVar15 = new d("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 14, "add");
        f9721q = dVar15;
        d dVar16 = new d("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 15, "rem");
        f9722r = dVar16;
        d dVar17 = new d("SET_CUSTOM_ATTRIBUTE_ARRAY", 16, "set");
        f9723s = dVar17;
        d dVar18 = new d("INAPP_MESSAGE_IMPRESSION", 17, "si");
        f9724t = dVar18;
        d dVar19 = new d("INAPP_MESSAGE_CONTROL_IMPRESSION", 18, "iec");
        f9725u = dVar19;
        d dVar20 = new d("INAPP_MESSAGE_CLICK", 19, "sc");
        f9726v = dVar20;
        d dVar21 = new d("INAPP_MESSAGE_BUTTON_CLICK", 20, "sbc");
        f9727w = dVar21;
        d dVar22 = new d("INAPP_MESSAGE_MESSAGE_EXTRAS", 21, InAppMessageBase.MESSAGE_EXTRAS);
        d dVar23 = new d("USER_ALIAS", 22, "uae");
        f9728x = dVar23;
        d dVar24 = new d("SESSION_START", 23, "ss");
        f9729y = dVar24;
        d dVar25 = new d("SESSION_END", 24, "se");
        f9730z = dVar25;
        d dVar26 = new d("TEST_TYPE", 25, "tt");
        d dVar27 = new d("LOCATION_CUSTOM_ATTRIBUTE_ADD", 26, "lcaa");
        A = dVar27;
        d dVar28 = new d("LOCATION_CUSTOM_ATTRIBUTE_REMOVE", 27, "lcar");
        B = dVar28;
        d dVar29 = new d("NESTED_CUSTOM_ATTRIBUTE_MERGE", 28, "ncam");
        C = dVar29;
        d dVar30 = new d("SUBSCRIPTION_GROUP_UPDATE", 29, "sgu");
        D = dVar30;
        d dVar31 = new d("FEATURE_FLAG_IMPRESSION_EVENT", 30, "ffi");
        E = dVar31;
        d dVar32 = new d("BANNER_IMPRESSION_EVENT", 31, "bi");
        F = dVar32;
        d dVar33 = new d("BANNER_CLICK_EVENT", 32, "bc");
        G = dVar33;
        d dVar34 = new d("PUSH_DELIVERY_EVENT", 33, "pde");
        H = dVar34;
        d dVar35 = new d("UNKNOWN", 34, "");
        I = dVar35;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, dVar25, dVar26, dVar27, dVar28, dVar29, dVar30, dVar31, dVar32, dVar33, dVar34, dVar35};
        J = dVarArr;
        a80.b bVar = new a80.b(dVarArr);
        f9707b = new c();
        int iA = w0.a(e0.o(bVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        k90.f fVar = new k90.f(bVar, 1);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            linkedHashMap.put(((d) next).f9731a, next);
        }
        f9708c = linkedHashMap;
    }

    public d(String str, int i11, String str2) {
        this.f9731a = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) J.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.f9731a;
    }
}
