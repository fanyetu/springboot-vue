<template>
    <div>
        <el-select v-model="interval" placeholder="自动刷新" clearable>
            <el-option
                    v-for="item in intervalOptions"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
            </el-option>
        </el-select>
        <el-select v-model="quick" placeholder="快速选择">
            <el-option
                    v-for="item in quickOptions"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
            </el-option>
        </el-select>
        <el-date-picker
                v-model="absolute"
                type="datetimerange"
                range-separator="至"
                start-placeholder="开始时间"
                end-placeholder="结束时间"
                align="right">
        </el-date-picker>
    </div>
</template>

<script>
    export default {
        name: "time-selector",
        data() {
            return {
                absolute: null,
                quick: null,
                interval: null,
                intervalOptions: [
                    {
                        value: 5 * 1000,
                        label: '5s'
                    },
                    {
                        value: 10 * 1000,
                        label: '10s'
                    },
                    {
                        value: 60 * 1000,
                        label: '1m'
                    }
                ],
                quickOptions: [
                    {
                        value: 15 * 60 * 1000,
                        label: '最近15分钟'
                    },
                    {
                        value: 30 * 60 * 1000,
                        label: '最近30分钟'
                    }
                ]
            }
        }
    }
</script>

<style scoped lang="less">

</style>