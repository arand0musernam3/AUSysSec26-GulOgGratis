package com.braze.events.internal;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.b f9812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.actions.h f9813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IInAppMessage f9814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9815d;

    public m(com.braze.triggers.events.b bVar, com.braze.triggers.actions.h hVar, IInAppMessage iInAppMessage, String str) {
        bVar.getClass();
        hVar.getClass();
        iInAppMessage.getClass();
        this.f9812a = bVar;
        this.f9813b = hVar;
        this.f9814c = iInAppMessage;
        this.f9815d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f9812a, mVar.f9812a) && Intrinsics.areEqual(this.f9813b, mVar.f9813b) && Intrinsics.areEqual(this.f9814c, mVar.f9814c) && Intrinsics.areEqual(this.f9815d, mVar.f9815d);
    }

    public final int hashCode() {
        int iHashCode = (this.f9814c.hashCode() + ((this.f9813b.hashCode() + (this.f9812a.hashCode() * 31)) * 31)) * 31;
        String str = this.f9815d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(this.f9814c.getJsonObject());
        String strC = this.f9813b.c();
        com.braze.triggers.events.b bVar = this.f9812a;
        String str = this.f9815d;
        StringBuilder sbT = e0.f.t("\n             ", prettyPrintedString, "\n             Triggered Action Id: ", strC, "\n             Trigger Event: ");
        sbT.append(bVar);
        sbT.append("\n             User Id: ");
        sbT.append(str);
        sbT.append("\n        ");
        return kotlin.text.s.c(sbT.toString());
    }
}
