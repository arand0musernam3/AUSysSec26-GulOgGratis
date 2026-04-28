package hk;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.R;
import e0.f;
import e10.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new b0(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f22096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f22098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f22101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f22102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f22103k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f22104m;

    public /* synthetic */ d(Integer num, ArrayList arrayList, Integer num2, List list, List list2, boolean z11, b bVar, b bVar2, String str, int i11) {
        this(num, (i11 & 2) != 0 ? null : arrayList, (i11 & 4) != 0 ? 0 : R.string.helpdesk_topic_how_it_works_title_food_was_not_fresh, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : list2, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0, (i11 & 256) != 0 ? null : bVar, (i11 & 512) != 0 ? null : bVar2, (i11 & 1024) == 0, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f22093a, dVar.f22093a) && Intrinsics.areEqual(this.f22094b, dVar.f22094b) && this.f22095c == dVar.f22095c && Intrinsics.areEqual(this.f22096d, dVar.f22096d) && Intrinsics.areEqual(this.f22097e, dVar.f22097e) && Intrinsics.areEqual(this.f22098f, dVar.f22098f) && this.f22099g == dVar.f22099g && this.f22100h == dVar.f22100h && this.f22101i == dVar.f22101i && this.f22102j == dVar.f22102j && this.f22103k == dVar.f22103k && Intrinsics.areEqual(this.l, dVar.l) && Intrinsics.areEqual(this.f22104m, dVar.f22104m);
    }

    public final int hashCode() {
        Integer num = this.f22093a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f22094b;
        int iB = k.b(this.f22095c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        Integer num2 = this.f22096d;
        int iHashCode2 = (iB + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list2 = this.f22097e;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f22098f;
        int iE = k.e(k.e((iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.f22099g), 31, this.f22100h);
        b bVar = this.f22101i;
        int iHashCode4 = (iE + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f22102j;
        int iE2 = k.e((iHashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f22103k);
        String str = this.l;
        int iHashCode5 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        List list4 = this.f22104m;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HelpDeskQuestion(questionTxt=");
        sb2.append(this.f22093a);
        sb2.append(", answerTxt=");
        sb2.append(this.f22094b);
        sb2.append(", titleTxt=");
        sb2.append(this.f22095c);
        sb2.append(", btnTxt=");
        sb2.append(this.f22096d);
        sb2.append(", multipleTitles=");
        sb2.append(this.f22097e);
        sb2.append(", multipleAnswers=");
        sb2.append(this.f22098f);
        sb2.append(", shouldShowBtn=");
        i.C(sb2, this.f22099g, ", showNeedHelpBtn=", this.f22100h, ", btnAction=");
        sb2.append(this.f22101i);
        sb2.append(", btnOtherAction=");
        sb2.append(this.f22102j);
        sb2.append(", showInstagramBtn=");
        sb2.append(this.f22103k);
        sb2.append(", trackingValue=");
        sb2.append(this.l);
        sb2.append(", includeCountries=");
        return f.p(sb2, this.f22104m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        Integer num = this.f22093a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
        List list = this.f22094b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                parcel.writeInt(((Number) itQ.next()).intValue());
            }
        }
        parcel.writeInt(this.f22095c);
        Integer num2 = this.f22096d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num2);
        }
        List list2 = this.f22097e;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ2 = i.q(parcel, 1, list2);
            while (itQ2.hasNext()) {
                parcel.writeInt(((Number) itQ2.next()).intValue());
            }
        }
        List list3 = this.f22098f;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ3 = i.q(parcel, 1, list3);
            while (itQ3.hasNext()) {
                parcel.writeInt(((Number) itQ3.next()).intValue());
            }
        }
        parcel.writeInt(this.f22099g ? 1 : 0);
        parcel.writeInt(this.f22100h ? 1 : 0);
        b bVar = this.f22101i;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        b bVar2 = this.f22102j;
        if (bVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar2.name());
        }
        parcel.writeInt(this.f22103k ? 1 : 0);
        parcel.writeString(this.l);
        parcel.writeStringList(this.f22104m);
    }

    public d(Integer num, List list, int i11, Integer num2, List list2, List list3, boolean z11, boolean z12, b bVar, b bVar2, boolean z13, String str, ArrayList arrayList) {
        this.f22093a = num;
        this.f22094b = list;
        this.f22095c = i11;
        this.f22096d = num2;
        this.f22097e = list2;
        this.f22098f = list3;
        this.f22099g = z11;
        this.f22100h = z12;
        this.f22101i = bVar;
        this.f22102j = bVar2;
        this.f22103k = z13;
        this.l = str;
        this.f22104m = arrayList;
    }
}
