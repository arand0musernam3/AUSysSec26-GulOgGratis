package zendesk.messaging.android.internal.conversationscreen.cache;

import i90.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.f0;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.messaging.android.internal.conversationscreen.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@h
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB=\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/cache/StoredForm;", "", "", "formId", "", "", "fields", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationscreen/cache/StoredForm;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lzendesk/messaging/android/internal/conversationscreen/cache/StoredForm;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormId", "Ljava/util/Map;", "getFields", "Companion", "$serializer", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StoredForm {

    @NotNull
    private final Map<Integer, String> fields;

    @NotNull
    private final String formId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new n(9))};

    public /* synthetic */ StoredForm(int i11, String str, Map map, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, StoredForm$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.formId = str;
        if ((i11 & 2) == 0) {
            this.fields = new LinkedHashMap();
        } else {
            this.fields = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f0(l0.f29821a, o30.f0.B(r1.f29848a), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoredForm copy$default(StoredForm storedForm, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storedForm.formId;
        }
        if ((i11 & 2) != 0) {
            map = storedForm.fields;
        }
        return storedForm.copy(str, map);
    }

    public static final /* synthetic */ void write$Self$zendesk_messaging_messaging_android(StoredForm self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.formId);
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.fields, new LinkedHashMap())) {
            return;
        }
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.fields);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @NotNull
    public final Map<Integer, String> component2() {
        return this.fields;
    }

    @NotNull
    public final StoredForm copy(@NotNull String formId, @NotNull Map<Integer, String> fields) {
        formId.getClass();
        fields.getClass();
        return new StoredForm(formId, fields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredForm)) {
            return false;
        }
        StoredForm storedForm = (StoredForm) other;
        return Intrinsics.areEqual(this.formId, storedForm.formId) && Intrinsics.areEqual(this.fields, storedForm.fields);
    }

    @NotNull
    public final Map<Integer, String> getFields() {
        return this.fields;
    }

    @NotNull
    public final String getFormId() {
        return this.formId;
    }

    public int hashCode() {
        return this.fields.hashCode() + (this.formId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "StoredForm(formId=" + this.formId + ", fields=" + this.fields + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/cache/StoredForm$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/messaging/android/internal/conversationscreen/cache/StoredForm;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return StoredForm$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StoredForm(@NotNull String str, @NotNull Map<Integer, String> map) {
        str.getClass();
        map.getClass();
        this.formId = str;
        this.fields = map;
    }

    public /* synthetic */ StoredForm(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new LinkedHashMap() : map);
    }
}
