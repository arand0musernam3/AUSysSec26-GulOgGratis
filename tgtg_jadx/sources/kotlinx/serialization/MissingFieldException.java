package kotlinx.serialization;

import e0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26631b;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(String str, ArrayList arrayList) {
        String strO;
        str.getClass();
        if (arrayList.size() == 1) {
            strO = f.o(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strO = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(strO, null, arrayList, str);
    }

    public MissingFieldException(String str, MissingFieldException missingFieldException, List list, String str2) {
        super(str, missingFieldException);
        this.f26630a = list;
        this.f26631b = str2;
    }
}
