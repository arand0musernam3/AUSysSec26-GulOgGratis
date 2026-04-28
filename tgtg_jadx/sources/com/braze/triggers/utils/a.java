package com.braze.triggers.utils;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.b f10885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10886b;

    public a(com.braze.triggers.enums.b bVar, String str) {
        bVar.getClass();
        str.getClass();
        this.f10885a = bVar;
        this.f10886b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10885a == aVar.f10885a && Intrinsics.areEqual(this.f10886b, aVar.f10886b);
    }

    public final int hashCode() {
        return this.f10886b.hashCode() + (this.f10885a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePath(pathType=" + this.f10885a + ", remoteUrl=" + this.f10886b + ")";
    }
}
