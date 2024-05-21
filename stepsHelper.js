const util = require('util')

step_template = {
    "branchId": "WFX",
    "name": "SX",
    "label": "LABEL",
    "type": "manual",
    "level": null,
    "target": [
        {
            "id": -1
        }
    ],
    "isSkipable": true,
    "isActive": true,
    "role": "ROLE",
    "staticInbox": [
        {
            "type": "CUSTOM",
            "isSelected": false
        },
        {
            "type": "ST",
            "isSelected": false
        },
        {
            "type": "RF",
            "isSelected": false
        }
    ],
    "slaActions": [
        {
            "label": "Auto Approve",
            "id": "approve",
            "isSelected": false
        },
        {
            "label": "Auto Reject",
            "id": "reject",
            "isSelected": false
        }
    ]
}
decision_template = {
    "branchId": "WFX",
    "name": "SX",
    "label": "Label",
    "type": "decision",
    "level": null,
    "isSkipable": false,
    "isActive": null,
    "role": null,
    "decisionOptions": [],
    "decisionId": -1
}

start_template = {
    "branchId": "WF1",
    "name": "S1",
    "label": "Start",
    "type": "start",
    "level": null,
    "target": [
        {
            "id": 2
        }
    ],
    "isSkipable": false,
    "isActive": true,
    "role": null
}

end_template = {
    "branchId": "WFX",
    "name": "SX",
    "label": "End",
    "type": "end",
    "level": null,
    "target": null,
    "isSkipable": false,
    "isActive": true,
    "role": null,
    "processType": null
}
//######################################################################################

// wf_desc = [

//     {
//         "type": "decision",
//         "decisionId": 1,
//         "branchId": "WF1",
//         "decisionLabel": "Is HR?",
//         "isActive": false,
//         "decisionOptions": [
//             {
//                 "label": "Yes",
//                 "hardcoded": "false",
//                 "branchId": "WF2"
//             },
//             {
//                 "label": "No",
//                 "hardcoded": "false",
//                 "branchId": "WF3",
//             },
//             {
//                 "label": "Test",
//                 "hardcoded": "false",
//                 "branchId": "WF5",
//             }
//         ]
//     },
//     {
//         "type": "steps",
//         "branchId": "WF2",
//         "steps": [
//             {
//                 "role": "Test",
//                 "label": "Test Label"
//             },
//             {
//                 "role": "Test1",
//                 "label": "Test Label 1"
//             },
//             {
//                 "role": "Test2",
//                 "label": "Test Label 2"
//             }
//         ],
//         "targetBranchId": "WF5"
//     },
//     {
//         "type": "steps",
//         "branchId": "WF3",
//         "steps": [
//             {
//                 "role": "Test3",
//                 "label": "Test Label 3"
//             },
//             {
//                 "role": "Test4",
//                 "label": "Test Label 4"
//             },
//             {
//                 "role": "Test5",
//                 "label": "Test Label 5"
//             }
//         ],
//         "targetBranchId": "WF5"
//     },
//     {
//         "type": "end",
//         "branchId": "WF5"
//     }
// ]

wf_desc = [

    {
        "type": "decision",
        "decisionId": 1,
        "branchId": "WF1",
        "decisionLabel": "Is STC Employee?",
        "isActive": false,
        "decisionOptions": [
            {
                "label": "Yes",
                "hardcoded": "false",
                "branchId": "WF3"
            },
            {
                "label": "No",
                "hardcoded": "false",
                "branchId": "WF2",
            }
        ]
    },
    {
        "type": "steps",
        "branchId": "WF2",
        "steps": [
            {
                "role": "SubsidiariesContractor",
                "label": "Subsidiaries Contractor"
            }
        ],
        "targetBranchId": "WF6"
    },
    {
        "type": "decision",
        "decisionId": 2,
        "branchId": "WF3",
        "decisionLabel": "Is Shuttle Bus?",
        "isActive": false,
        "decisionOptions": [
            {
                "label": "Yes",
                "hardcoded": "false",
                "branchId": "WF4"
            },
            {
                "label": "No",
                "hardcoded": "false",
                "branchId": "WF5",
            }
        ]
    },
    {
        "type": "decision",
        "decisionId": 3,
        "branchId": "WF5",
        "decisionLabel": "Days <= 1?",
        "isActive": false,
        "decisionOptions": [
            {
                "label": "Yes",
                "hardcoded": "false",
                "branchId": "WF11"
            },
            {
                "label": "No",
                "hardcoded": "false",
                "branchId": "WF4",
            }
        ]
    },
    {
        "type": "steps",
        "branchId": "WF4",
        "steps": [
            {
                "role": "DM",
                "label": "Direct Manager"
            }
        ],
        "targetBranchId": "WF6"

    },
    {
        "type": "decision",
        "decisionId": 4,
        "branchId": "WF6",
        "decisionLabel": "Is Shuttle Bus?",
        "isActive": false,
        "decisionOptions": [
            {
                "label": "Yes",
                "hardcoded": "false",
                "branchId": "WF7"
            },
            {
                "label": "No",
                "hardcoded": "false",
                "branchId": "WF8",
            }
        ]
    },
    {
        "type": "steps",
        "branchId": "WF7",
        "steps": [
            {
                "role": "FleetDirector",
                "label": "Fleet Director"
            }
        ],
        "targetBranchId": "WF11"
    },
    
    {
        "type": "decision",
        "decisionId": 5,
        "branchId": "WF8",
        "decisionLabel": "Duration",
        "isActive": false,
        "decisionOptions": [
            {
                "label": "<= 3",
                "hardcoded": "false",
                "branchId": "WF10"
            },
            {
                "label": ">= 4 & <= 8",
                "hardcoded": "false",
                "branchId": "WF9"
            },
            {
                "label": ">= 9",
                "hardcoded": "false",
                "branchId": "WF7"
            }
        ]
    },
    {
        "type": "steps",
        "branchId": "WF9",
        "steps": [
            {
                "role": "RegionSM",
                "label": "Region SM"
            }
        ],
        "targetBranchId": "WF11"
    },
    {
        "type": "steps",
        "branchId": "WF10",
        "steps": [
            {
                "role": "DepartmentHead",
                "label": "Department Head"
            }
        ],
        "targetBranchId": "WF11"
    },
    {
        "type": "steps",
        "branchId": "WF11",
        "steps": [
            {
                "role": "ResponsibleEmployee",
                "label": "Responsible Employee"
            }
        ],
        "targetBranchId": "WF12"
    },
    {
        "type": "decision",
        "decisionId": 6,
        "branchId": "WF12",
        "decisionLabel": "Is Shuttle Bus?",
        "isActive": false,
        "decisionOptions": [
            {
                "label": "Yes",
                "hardcoded": "false",
                "branchId": "WF14"
            },
            {
                "label": "No",
                "hardcoded": "false",
                "branchId": "WF13",
            }
        ]
    },
    {
        "type": "steps",
        "branchId": "WF13",
        "steps": [
            {
                "role": "REQUESTER2",
                "label": "Vehicle Recipient (Requester)"
            }
        ],
        "targetBranchId": "WF14"
    },
    {
        "type": "end",
        "branchId": "WF14"
    }
]

final_steps_arr = [start_template]
var id = 2;
var new_step = null;
var wf_id_tracker = {}
for (let i = 0; i < wf_desc.length; i++) {
    if (wf_desc[i].type == "steps") {
        for (let j = 0; j < wf_desc[i].steps.length; j++) {
            if (j == 0) {
                wf_id_tracker[wf_desc[i].branchId] = id;
            }
            new_step = structuredClone(step_template);
            new_step.branchId = wf_desc[i].branchId;
            new_step.name = "S" + id;
            id++;
            new_step.role = wf_desc[i].steps[j].role;
            new_step.label = wf_desc[i].steps[j].label;
            if (j + 1 == wf_desc[i].steps.length && wf_desc[i].targetBranchId) {
                new_step.target[0].id = wf_desc[i].targetBranchId;
            } else {
                new_step.target[0].id = id;
            }
            final_steps_arr.push(structuredClone(new_step));
        }
    }
    if (wf_desc[i].type == "decision") {
        if (!wf_id_tracker[wf_desc[i].branchId]) {
            wf_id_tracker[wf_desc[i].branchId] = id;
        }
        new_step = structuredClone(decision_template);
        new_step.branchId = wf_desc[i].branchId;
        new_step.name = "S" + id;
        id++;
        new_step.decisionId = wf_desc[i].decisionId;
        new_step.label = wf_desc[i].decisionLabel;
        new_step.decisionOptions = wf_desc[i].decisionOptions;
        new_step.isActive = wf_desc[i].isActive;
        final_steps_arr.push(structuredClone(new_step));
    }
    if (wf_desc[i].type == "end") {
        if (!wf_id_tracker[wf_desc[i].branchId]) {
            wf_id_tracker[wf_desc[i].branchId] = id;
        }
        new_step = structuredClone(end_template);
        new_step.branchId = wf_desc[i].branchId;
        new_step.name = "S" + id;
        final_steps_arr.push(structuredClone(new_step));
    }
}

// ADD TARGET IDS
for (let k = 0; k < final_steps_arr.length; k++) {
    if (final_steps_arr[k].type == 'decision') {
        for (let l = 0; l < final_steps_arr[k].decisionOptions.length; l++) {
            final_steps_arr[k].decisionOptions[l].targetId = wf_id_tracker[final_steps_arr[k].decisionOptions[l].branchId] + "";
        }
    }
    if (final_steps_arr[k].type == 'manual') {
        if ((final_steps_arr[k].target[0].id + "").includes("WF"))
            final_steps_arr[k].target[0].id = wf_id_tracker[final_steps_arr[k].target[0].id];
    }
}

console.log(JSON.stringify(final_steps_arr));

console.log(wf_id_tracker);