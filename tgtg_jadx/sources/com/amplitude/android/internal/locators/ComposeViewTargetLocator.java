package com.amplitude.android.internal.locators;

import af.d;
import af.e;
import android.view.View;
import androidx.compose.ui.node.Owner;
import b5.m0;
import c5.k3;
import c5.l2;
import c5.y;
import defpackage.a;
import ef.b;
import h4.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u70.l;
import u70.t;
import z4.c0;
import z4.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/amplitude/android/internal/locators/ComposeViewTargetLocator;", "Lef/b;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeViewTargetLocator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewTargetLocator.kt\ncom/amplitude/android/internal/locators/ComposeViewTargetLocator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n800#2,11:147\n*S KotlinDebug\n*F\n+ 1 ComposeViewTargetLocator.kt\ncom/amplitude/android/internal/locators/ComposeViewTargetLocator\n*L\n95#1:147,11\n*E\n"})
public final class ComposeViewTargetLocator implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf.b f8863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f8864b;

    public ComposeViewTargetLocator(kf.b bVar) {
        bVar.getClass();
        this.f8863a = bVar;
        this.f8864b = l.b(new a(this, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [z4.z] */
    /* JADX WARN: Type inference failed for: r0v23, types: [b5.x] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, java.lang.Object] */
    @Override // ef.b
    public final e a(View view, Pair pair, d dVar) {
        boolean z11;
        c cVarF;
        boolean zA;
        view.getClass();
        dVar.getClass();
        c cVar = null;
        Owner owner = view instanceof Owner ? (Owner) view : null;
        if (owner == null) {
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(((y) owner).getRoot());
        String str = null;
        String strU = null;
        String str2 = null;
        String str3 = null;
        boolean z12 = false;
        while (!arrayDeque.isEmpty()) {
            m0 m0Var = (m0) arrayDeque.poll();
            if (m0Var != null) {
                if (m0Var.J()) {
                    defpackage.b bVar = (defpackage.b) this.f8864b.getValue();
                    bVar.getClass();
                    try {
                        List listU = m0Var.u();
                        Object objFirstOrNull = CollectionsKt.firstOrNull(listU);
                        z0 z0Var = (z0) objFirstOrNull;
                        if (z0Var == null || !z0Var.f47256b.n()) {
                            objFirstOrNull = cVar;
                        }
                        z0 z0Var2 = (z0) objFirstOrNull;
                        t tVarB = l.b(new a(listU, 0));
                        if (z0Var2 == null) {
                            z0Var2 = (z0) tVarB.getValue();
                        }
                        ?? r02 = z0Var2 != null ? z0Var2.f47256b : cVar;
                        if (r02 == 0) {
                            r02 = m0Var.G.f5857c;
                        }
                        cVarF = c0.f(r02, true);
                    } catch (Exception unused) {
                        bVar.f5032a.d("Could not fetch position for LayoutNode");
                        cVarF = cVar;
                    }
                    if (cVarF == null) {
                        z11 = z12;
                        zA = false;
                    } else {
                        z11 = z12;
                        zA = cVarF.a((((long) Float.floatToRawIntBits(((Number) pair.f26486b).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(((Number) pair.f26485a).floatValue())) << 32));
                    }
                    if (zA) {
                        Iterator it = m0Var.u().iterator();
                        boolean z13 = false;
                        while (it.hasNext()) {
                            b4.t tVar = ((z0) it.next()).f47255a;
                            if (tVar instanceof l2) {
                                l2 l2Var = (l2) tVar;
                                String nameFallback = l2Var.getNameFallback();
                                if (nameFallback != null) {
                                    int iHashCode = nameFallback.hashCode();
                                    if (iHashCode != -1964681502) {
                                        if (iHashCode != -1422466648) {
                                            if (iHashCode == -932820115 && nameFallback.equals("semantics")) {
                                                for (k3 k3Var : l2Var.getInspectableElements()) {
                                                    if (Intrinsics.areEqual(k3Var.f7274a, "properties")) {
                                                        Object obj = k3Var.f7275b;
                                                        if (obj instanceof LinkedHashMap) {
                                                            for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
                                                                entry.getClass();
                                                                Object key = entry.getKey();
                                                                Object value = entry.getValue();
                                                                if (Intrinsics.areEqual(key, "TestTag")) {
                                                                    str = value instanceof String ? (String) value : null;
                                                                } else if (Intrinsics.areEqual(key, "ContentDescription")) {
                                                                    List list = value instanceof List ? (List) value : null;
                                                                    if (list != null) {
                                                                        ArrayList arrayList = new ArrayList();
                                                                        for (Object obj2 : list) {
                                                                            if (obj2 instanceof String) {
                                                                                arrayList.add(obj2);
                                                                            }
                                                                        }
                                                                        strU = CollectionsKt.U(arrayList, ", ", null, null, null, 62);
                                                                    } else {
                                                                        strU = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (nameFallback.equals("testTag")) {
                                            Iterator it2 = l2Var.getInspectableElements().iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    break;
                                                }
                                                k3 k3Var2 = (k3) it2.next();
                                                if (Intrinsics.areEqual(k3Var2.f7274a, "tag")) {
                                                    Object obj3 = k3Var2.f7275b;
                                                    str = obj3 instanceof String ? (String) obj3 : null;
                                                }
                                            }
                                        }
                                    } else if (nameFallback.equals("clickable")) {
                                        z13 = true;
                                    }
                                }
                                String name = tVar.getClass().getName();
                                if (Intrinsics.areEqual(name, "androidx.compose.foundation.ClickableElement") || Intrinsics.areEqual(name, "androidx.compose.foundation.CombinedClickableElement")) {
                                    z13 = true;
                                }
                            }
                        }
                        if (z13) {
                            if (dVar == d.Clickable) {
                                str2 = str;
                                str3 = strU;
                                z12 = true;
                            }
                            arrayDeque.addAll(m0Var.z().f());
                            cVar = null;
                        }
                        z12 = z11;
                        arrayDeque.addAll(m0Var.z().f());
                        cVar = null;
                    }
                } else {
                    z11 = z12;
                }
                z12 = z11;
                arrayDeque.addAll(m0Var.z().f());
                cVar = null;
            }
        }
        if (z12) {
            return new e(null, null, null, str2, null, str3, "jetpack_compose", null, false, false);
        }
        return null;
    }
}
