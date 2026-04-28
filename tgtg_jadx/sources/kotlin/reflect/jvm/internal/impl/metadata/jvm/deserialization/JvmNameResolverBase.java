package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k90.g;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.r0;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1208#2,2:107\n1238#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> PREDEFINED_STRINGS;

    @NotNull
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f26568kotlin;

    @NotNull
    private final Set<Integer> localNameIndices;

    @NotNull
    private final List<JvmProtoBuf.StringTableTypes.Record> records;

    @NotNull
    private final String[] strings;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strU = CollectionsKt.U(d0.h('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        f26568kotlin = strU;
        List<String> listH = d0.h(strU.concat("/Any"), strU.concat("/Nothing"), strU.concat("/Unit"), strU.concat("/Throwable"), strU.concat("/Number"), strU.concat("/Byte"), strU.concat("/Double"), strU.concat("/Float"), strU.concat("/Int"), strU.concat("/Long"), strU.concat("/Short"), strU.concat("/Boolean"), strU.concat("/Char"), strU.concat("/CharSequence"), strU.concat("/String"), strU.concat("/Comparable"), strU.concat("/Enum"), strU.concat("/Array"), strU.concat("/ByteArray"), strU.concat("/DoubleArray"), strU.concat("/FloatArray"), strU.concat("/IntArray"), strU.concat("/LongArray"), strU.concat("/ShortArray"), strU.concat("/BooleanArray"), strU.concat("/CharArray"), strU.concat("/Cloneable"), strU.concat("/Annotation"), strU.concat("/collections/Iterable"), strU.concat("/collections/MutableIterable"), strU.concat("/collections/Collection"), strU.concat("/collections/MutableCollection"), strU.concat("/collections/List"), strU.concat("/collections/MutableList"), strU.concat("/collections/Set"), strU.concat("/collections/MutableSet"), strU.concat("/collections/Map"), strU.concat("/collections/MutableMap"), strU.concat("/collections/Map.Entry"), strU.concat("/collections/MutableMap.MutableEntry"), strU.concat("/collections/Iterator"), strU.concat("/collections/MutableIterator"), strU.concat("/collections/ListIterator"), strU.concat("/collections/MutableListIterator"));
        PREDEFINED_STRINGS = listH;
        g gVarX0 = CollectionsKt.x0(listH);
        int iA = w0.a(e0.o(gVarX0, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = gVarX0.iterator();
        while (true) {
            r0 r0Var = (r0) it;
            if (!r0Var.f26536b.hasNext()) {
                PREDEFINED_STRINGS_MAP = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) r0Var.next();
                linkedHashMap.put((String) indexedValue.f26489b, Integer.valueOf(indexedValue.f26488a));
            }
        }
    }

    public JvmNameResolverBase(@NotNull String[] strArr, @NotNull Set<Integer> set, @NotNull List<JvmProtoBuf.StringTableTypes.Record> list) {
        strArr.getClass();
        set.getClass();
        list.getClass();
        this.strings = strArr;
        this.localNameIndices = set;
        this.records = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i11) {
        return getString(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.getString(int):java.lang.String");
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i11) {
        return this.localNameIndices.contains(Integer.valueOf(i11));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
