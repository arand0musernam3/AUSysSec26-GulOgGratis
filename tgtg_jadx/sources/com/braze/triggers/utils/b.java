package com.braze.triggers.utils;

import a40.i;
import com.braze.triggers.actions.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator f10887b = new i(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityQueue f10888a;

    public b(ArrayList arrayList) {
        arrayList.getClass();
        PriorityQueue priorityQueue = new PriorityQueue(12, f10887b);
        this.f10888a = priorityQueue;
        priorityQueue.addAll(arrayList);
    }

    public static final int a(com.braze.triggers.actions.a aVar, com.braze.triggers.actions.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        g gVar = (g) aVar;
        int i11 = gVar.f10799b.f10825c;
        g gVar2 = (g) aVar2;
        int i12 = gVar2.f10799b.f10825c;
        if (i11 > i12) {
            return -1;
        }
        if (i11 < i12) {
            return 1;
        }
        return gVar.f10798a.compareTo(gVar2.f10798a);
    }
}
