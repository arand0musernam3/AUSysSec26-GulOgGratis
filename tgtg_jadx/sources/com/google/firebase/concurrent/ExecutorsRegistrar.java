package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.m;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import qc.y;
import t30.a;
import t30.c;
import t30.d;
import u30.b;
import u30.k;
import u30.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f12751a = new k(new m(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f12752b = new k(new m(5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f12753c = new k(new m(6));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f12754d = new k(new m(7));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        o oVar = new o(a.class, ScheduledExecutorService.class);
        o[] oVarArr = {new o(a.class, ExecutorService.class), new o(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oVar);
        for (o oVar2 : oVarArr) {
            android.support.v4.media.session.a.k(oVar2, "Null interface");
        }
        Collections.addAll(hashSet, oVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new y(17), hashSet3);
        o oVar3 = new o(t30.b.class, ScheduledExecutorService.class);
        o[] oVarArr2 = {new o(t30.b.class, ExecutorService.class), new o(t30.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(oVar3);
        for (o oVar4 : oVarArr2) {
            android.support.v4.media.session.a.k(oVar4, "Null interface");
        }
        Collections.addAll(hashSet4, oVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new y(18), hashSet6);
        o oVar5 = new o(c.class, ScheduledExecutorService.class);
        o[] oVarArr3 = {new o(c.class, ExecutorService.class), new o(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(oVar5);
        for (o oVar6 : oVarArr3) {
            android.support.v4.media.session.a.k(oVar6, "Null interface");
        }
        Collections.addAll(hashSet7, oVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new y(19), hashSet9);
        u30.a aVarB = b.b(new o(d.class, Executor.class));
        aVarB.f40668f = new y(20);
        return Arrays.asList(bVar, bVar2, bVar3, aVarB.b());
    }
}
