package com.braze.triggers.utils;

import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.s;
import com.braze.triggers.actions.h;
import e0.f;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mw.g;
import org.json.JSONArray;
import org.json.JSONObject;
import qw.e;
import rg.m;
import w.a0;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f10889a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10890b = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(org.json.JSONArray r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.triggers.utils.c.a(org.json.JSONArray):java.util.ArrayList");
    }

    public static final String c(String str) {
        return f.k("Received unknown trigger type: ", str);
    }

    public final h b(JSONObject jSONObject, r rVar) {
        jSONObject.getClass();
        rVar.getClass();
        try {
            String string = jSONObject.getString("type");
            if (Intrinsics.areEqual(string, "inapp")) {
                return new com.braze.triggers.actions.c(jSONObject, rVar);
            }
            if (Intrinsics.areEqual(string, "templated_iam")) {
                return new com.braze.triggers.actions.f(jSONObject, rVar);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new e(string, 12), 6, (Object) null);
            return null;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10890b, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new bw.a(jSONObject, 21), 8, (Object) null);
            return null;
        }
    }

    public static final String c() {
        return "Triggered actions Json array was null. Not de-serializing triggered actions.";
    }

    public static final String b(JSONArray jSONArray) {
        return "Failed to deserialize triggered actions Json array: " + jSONArray;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize triggered action Json: " + jSONObject;
    }

    public static final String b() {
        return "Received null or blank trigger condition Json. Not parsing.";
    }

    public static final String b(String str) {
        return a0.p("Received triggered condition Json with unknown type: ", str, ". Not parsing.");
    }

    public static final String a() {
        return "Templated message Json was null. Not de-serializing templated message.";
    }

    public static final String a(String str) {
        return a0.p("Received templated message Json with unknown type: ", str, ". Not parsing.");
    }

    public static final String a(JSONObject jSONObject) {
        return "Encountered exception processing templated message: " + jSONObject;
    }

    public final ArrayList a(JSONArray jSONArray, r rVar) {
        rVar.getClass();
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10890b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m(29), 14, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                jSONObject.getClass();
                h hVarB = b(jSONObject, rVar);
                if (hVarB != null) {
                    arrayList.add(hVarB);
                }
            }
            return arrayList;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10890b, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new g(1, jSONArray), 8, (Object) null);
            return null;
        }
    }

    public static InAppMessageBase a(JSONObject jSONObject, r rVar) {
        rVar.getClass();
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10890b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m(27), 14, (Object) null);
                return null;
            }
            String string = jSONObject.getString("type");
            if (Intrinsics.areEqual(string, "inapp")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(Bayeux.KEY_DATA);
                if (jSONObject2 == null) {
                    return null;
                }
                return s.a(jSONObject2, rVar);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10890b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e(string, 11), 12, (Object) null);
            return null;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10890b, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new bw.a(jSONObject, 20), 8, (Object) null);
            return null;
        }
    }
}
