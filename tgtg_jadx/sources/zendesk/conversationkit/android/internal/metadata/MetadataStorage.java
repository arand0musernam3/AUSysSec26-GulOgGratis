package zendesk.conversationkit.android.internal.metadata;

import ba0.g;
import c90.f;
import com.braze.h2;
import j4.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import m90.c1;
import m90.d;
import m90.r1;
import n90.c;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.p0;
import v80.x;
import y70.a;
import z70.e;
import z70.i;
import zendesk.storage.android.PersistedProperty;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR/\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R/\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#¨\u0006)"}, d2 = {"Lzendesk/conversationkit/android/internal/metadata/MetadataStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "Ln90/c;", "json", "<init>", "(Lzendesk/storage/android/Storage;Ln90/c;)V", "", "", "fields", "", "saveConversationFields", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "getConversationFields", "(Lx70/c;)Ljava/lang/Object;", "clearConversationFields", "", "tags", "saveConversationTags", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "getConversationTags", "clearConversationTags", "clear", "Lzendesk/storage/android/Storage;", "Ln90/c;", "Lv80/x;", "persistenceDispatcher", "Lv80/x;", "<set-?>", "customFields$delegate", "Lzendesk/storage/android/PersistedProperty;", "getCustomFields", "()Ljava/lang/String;", "setCustomFields", "(Ljava/lang/String;)V", "customFields", "tags$delegate", "getTags", "setTags", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMetadataStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,104:1\n63#2:105\n63#2:106\n*S KotlinDebug\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage\n*L\n24#1:105\n29#1:106\n*E\n"})
public final class MetadataStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(MetadataStorage.class, "customFields", "getCustomFields()Ljava/lang/String;", 0), s.t(MetadataStorage.class, "tags", "getTags()Ljava/lang/String;", 0)};

    @NotNull
    private static final String KEY_CUSTOM_FIELDS = "CUSTOM_FIELDS";

    @NotNull
    private static final String KEY_TAGS = "TAGS";

    /* JADX INFO: renamed from: customFields$delegate, reason: from kotlin metadata */
    @NotNull
    private final PersistedProperty customFields;

    @NotNull
    private final c json;

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: tags$delegate, reason: from kotlin metadata */
    @NotNull
    private final PersistedProperty tags;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataStorage$clear$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataStorage$clear$2", f = "MetadataStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MetadataStorage.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            MetadataStorage.this.storage.clear();
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataStorage$clearConversationFields$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataStorage$clearConversationFields$2", f = "MetadataStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02452 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C02452(x70.c<? super C02452> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MetadataStorage.this.new C02452(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02452) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            MetadataStorage.this.setCustomFields(null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataStorage$clearConversationTags$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataStorage$clearConversationTags$2", f = "MetadataStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02462 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C02462(x70.c<? super C02462> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MetadataStorage.this.new C02462(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02462) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            MetadataStorage.this.setTags(null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataStorage$getConversationFields$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataStorage$getConversationFields$2", f = "MetadataStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv80/b0;", "", "", "", "<anonymous>", "(Lv80/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nMetadataStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage$getConversationFields$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,104:1\n222#2:105\n*S KotlinDebug\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage$getConversationFields$2\n*L\n48#1:105\n*E\n"})
    public static final class C02472 extends i implements Function2<b0, x70.c<? super Map<String, ? extends Object>>, Object> {
        int label;

        public C02472(x70.c<? super C02472> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MetadataStorage.this.new C02472(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Map<String, ? extends Object>> cVar) {
            return ((C02472) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            String customFields = MetadataStorage.this.getCustomFields();
            if (customFields == null) {
                return null;
            }
            c cVar = MetadataStorage.this.json;
            i2.x xVar = cVar.f30750b;
            r1 r1Var = r1.f29848a;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            xVar.getClass();
            orCreateKotlinClass.getClass();
            KSerializer kSerializerD = xVar.d(orCreateKotlinClass, n0.f26529a);
            if (kSerializerD != null) {
                return (Map) cVar.b(f0.B(new m90.f0(r1Var, kSerializerD, 1)), customFields);
            }
            throw new SerializationException(c1.i(orCreateKotlinClass));
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataStorage$getConversationTags$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataStorage$getConversationTags$2", f = "MetadataStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "", "", "<anonymous>", "(Lv80/b0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    public static final class C02482 extends i implements Function2<b0, x70.c<? super List<? extends String>>, Object> {
        int label;

        public C02482(x70.c<? super C02482> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MetadataStorage.this.new C02482(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super List<String>> cVar) {
            return ((C02482) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            String tags = MetadataStorage.this.getTags();
            if (tags == null) {
                return null;
            }
            c cVar = MetadataStorage.this.json;
            f0.R(StringCompanionObject.INSTANCE);
            return (List) cVar.b(new d(r1.f29848a, 0), tags);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataStorage$saveConversationFields$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataStorage$saveConversationFields$2", f = "MetadataStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nMetadataStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage$saveConversationFields$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,104:1\n205#2:105\n*S KotlinDebug\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage$saveConversationFields$2\n*L\n38#1:105\n*E\n"})
    public static final class C02492 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $fields;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02492(Map<String, ? extends Object> map, x70.c<? super C02492> cVar) {
            super(2, cVar);
            this.$fields = map;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MetadataStorage.this.new C02492(this.$fields, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02492) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            c cVar = MetadataStorage.this.json;
            Map<String, Object> map = this.$fields;
            i2.x xVar = cVar.f30750b;
            r1 r1Var = r1.f29848a;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            xVar.getClass();
            orCreateKotlinClass.getClass();
            KSerializer kSerializerD = xVar.d(orCreateKotlinClass, n0.f26529a);
            if (kSerializerD == null) {
                throw new SerializationException(c1.i(orCreateKotlinClass));
            }
            MetadataStorage.this.setCustomFields(cVar.c(new m90.f0(r1Var, kSerializerD, 1), map));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataStorage$saveConversationTags$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataStorage$saveConversationTags$2", f = "MetadataStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nMetadataStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage$saveConversationTags$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,104:1\n205#2:105\n*S KotlinDebug\n*F\n+ 1 MetadataStorage.kt\nzendesk/conversationkit/android/internal/metadata/MetadataStorage$saveConversationTags$2\n*L\n68#1:105\n*E\n"})
    public static final class C02502 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ List<String> $tags;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02502(List<String> list, x70.c<? super C02502> cVar) {
            super(2, cVar);
            this.$tags = list;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MetadataStorage.this.new C02502(this.$tags, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02502) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            MetadataStorage metadataStorage = MetadataStorage.this;
            c cVar = metadataStorage.json;
            List<String> list = this.$tags;
            cVar.getClass();
            metadataStorage.setTags(cVar.c(new d(r1.f29848a, 0), list));
            return Unit.f26487a;
        }
    }

    public MetadataStorage(@NotNull Storage storage, @NotNull c cVar) {
        storage.getClass();
        cVar.getClass();
        this.storage = storage;
        this.json = cVar;
        f fVar = p0.f42144a;
        this.persistenceDispatcher = c90.e.f7834b.z0(1);
        this.customFields = new PersistedProperty(storage, KEY_CUSTOM_FIELDS, String.class);
        this.tags = new PersistedProperty(storage, KEY_TAGS, String.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCustomFields() {
        return (String) this.customFields.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTags() {
        return (String) this.tags.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCustomFields(String str) {
        this.customFields.setValue(this, $$delegatedProperties[0], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTags(String str) {
        this.tags.setValue(this, $$delegatedProperties[1], str);
    }

    @Nullable
    public final Object clear(@NotNull x70.c<? super Unit> cVar) {
        Object objK = v80.f0.K(this.persistenceDispatcher, new AnonymousClass2(null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object clearConversationFields(@NotNull x70.c<? super Unit> cVar) {
        Object objK = v80.f0.K(this.persistenceDispatcher, new C02452(null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object clearConversationTags(@NotNull x70.c<? super Unit> cVar) {
        Object objK = v80.f0.K(this.persistenceDispatcher, new C02462(null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object getConversationFields(@NotNull x70.c<? super Map<String, ? extends Object>> cVar) {
        return v80.f0.K(this.persistenceDispatcher, new C02472(null), cVar);
    }

    @Nullable
    public final Object getConversationTags(@NotNull x70.c<? super List<String>> cVar) {
        return v80.f0.K(this.persistenceDispatcher, new C02482(null), cVar);
    }

    @Nullable
    public final Object saveConversationFields(@NotNull Map<String, ? extends Object> map, @NotNull x70.c<? super Unit> cVar) {
        Object objK = v80.f0.K(this.persistenceDispatcher, new C02492(map, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object saveConversationTags(@NotNull List<String> list, @NotNull x70.c<? super Unit> cVar) {
        Object objK = v80.f0.K(this.persistenceDispatcher, new C02502(list, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }
}
