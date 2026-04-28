package zn;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import u70.j;
import u70.l;
import u70.m;
import y00.d4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f48000a;

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new d4(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f47999b = {l.a(m.PUBLICATION, new zendesk.ui.android.conversation.composer.b(16))};

    public /* synthetic */ c(int i11, List list) {
        if (1 == (i11 & 1)) {
            this.f48000a = list;
        } else {
            c1.j(i11, 1, a.f47998a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f48000a, ((c) obj).f48000a);
    }

    public final int hashCode() {
        return this.f48000a.hashCode();
    }

    public final String toString() {
        return e0.f.m("PopupConfigurationPayload(popupOrder=", ")", this.f48000a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        Iterator itR = i.r(this.f48000a, parcel);
        while (itR.hasNext()) {
            parcel.writeString(((e) itR.next()).name());
        }
    }

    public c(ArrayList arrayList) {
        this.f48000a = arrayList;
    }
}
